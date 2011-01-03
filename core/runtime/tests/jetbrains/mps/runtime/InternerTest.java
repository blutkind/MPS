package jetbrains.mps.runtime;

import jetbrains.mps.util.Interner;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;


/**
 * Created by IntelliJ IDEA.
 * User: fyodor
 * Date: Dec 16, 2010
 * Time: 3:07:02 PM
 * To change this template use File | Settings | File Templates.
 */


public class InternerTest {

  @Test
  public void cacheRandomStrings() {
    final int maxObjects = 20000;
    final int maxThreads = Runtime.getRuntime().availableProcessors()*3;
    final int maxRepetitions = 1000000;

    long refTime = computeMedian(new LongProducer() {
      @Override
      public long produce() {
        return computePerformanceBenchmark(maxThreads);
      }
    });

    long time = computeMedian(new LongProducer() {
      @Override
      public long produce() {
        return loadTestNoOverflow(maxObjects, maxThreads, maxRepetitions);
      }
    });

    double ratio = time / (double) refTime;

    Assert.assertTrue("Interner perfomance is not within bounds: "+ratio,  0.45 < ratio && ratio < 1.95);
  }

  @Test
  public void stressTestWithRandomStrings() {
    final int maxObjects = 2000;
    final int maxThreads = Runtime.getRuntime().availableProcessors()*3;
    final int maxRepetitions = 1000;

    long refTime = computeMedian(new LongProducer() {
      @Override
      public long produce() {
        return computePerformanceBenchmark(maxThreads);
      }
    });

    long time = computeMedian(new LongProducer() {
      @Override
      public long produce() {
        return loadTestWithOverflow(maxObjects, maxThreads, maxRepetitions);
      }
    });

    double ratio = time / (double) refTime;

    Assert.assertTrue("Interner perfomance is not within bounds: "+ratio,  0.45 < ratio && ratio < 1.95);
  }

  @Test
  public void stressTestWithSimilarStrings() {
    final int maxObjects = 5000;
    final int maxThreads = Runtime.getRuntime().availableProcessors() * 20;
    final int maxRepetitions = 100000;

    long refTime = computeMedian(new LongProducer() {
      @Override
      public long produce() {
        return computePerformanceBenchmark(maxThreads);
      }
    });

    long time = computeMedian(new LongProducer() {
      @Override
      public long produce() {
        return loadTestWithSimilarStrings(maxObjects, maxThreads, maxRepetitions);
      }
    });

    double ratio = time / (double) refTime;

    Assert.assertTrue("Interner perfomance is not within bounds: " + ratio, 0.45 < ratio && ratio < 1.95);
  }


  private long loadTestNoOverflow(final int maxObjects, final int maxThreads, final int maxRepetitions) {
    final Interner interner = new Interner(maxObjects);
    final long start = System.currentTimeMillis();

    runInParallel(maxThreads, new Runnable (){
        @Override
        public void run() {
          Random rnd = new Random ();
          StringBuilder sb = new StringBuilder();
          List<String> list = new ArrayList<String>();
          for (int count=maxObjects/maxThreads/3; count > 0; --count) {
            sb.setLength(0);
            for (int size = Math.max (5, Math.min(200, (int) (rnd.nextGaussian() * 30 + 50))); size > 0; --size) {
              sb.append ((char)(rnd.nextInt(127-32)+32));
            }
            list.add (interner.intern(sb.toString()));
          }

          for (int count= maxRepetitions; count > 0; --count) {
            String s = list.get(rnd.nextInt(list.size()));
            Assert.assertSame(s, interner.intern(s));
          }

        }
      });

    return System.currentTimeMillis() - start;
  }

  private long loadTestWithOverflow(final int maxObjects, final int maxThreads, final int maxRepetitions) {
    final Interner interner = new Interner(maxObjects);
    final long start = System.currentTimeMillis();

    runInParallel(maxThreads, new Runnable (){
        @Override
        public void run() {
          Random rnd = new Random ();
          StringBuilder sb = new StringBuilder();
          List<String> list = new ArrayList<String>();
          for (int count=maxObjects*2; count > 0; --count) {
            sb.setLength(0);
            for (int size = Math.max (5, Math.min(200, (int) (rnd.nextGaussian() * 30 + 50))); size > 0; --size) {
              sb.append ((char)(rnd.nextInt(127-32)+32));
            }
            list.add (interner.intern(sb.toString()));
          }

          for (int count= maxRepetitions; count > 0; --count) {
            String s = list.get(rnd.nextInt(list.size()));
            Assert.assertEquals(s, interner.intern(s));
          }

        }
      });

    return System.currentTimeMillis() - start;
  }

  private long loadTestWithSimilarStrings(final int maxObjects, final int maxThreads, final int maxRepetitions) {
    final Interner interner = new Interner(maxObjects);
    final long start = System.currentTimeMillis();

    final long seed = System.currentTimeMillis();
    runInParallel(maxThreads, new Runnable (){
        @Override
        public void run() {
          Random rnd = new Random (seed);
          StringBuilder sb = new StringBuilder();
          List<String> list = new ArrayList<String>();
          for (int count=maxObjects*2; count > 0; --count) {
            sb.setLength(0);
            for (int size = Math.max (5, Math.min(200, (int) (rnd.nextGaussian() * 30 + 50))); size > 0; --size) {
              sb.append ((char)(rnd.nextInt(127-32)+32));
            }
            list.add (/*interner.intern*/(sb.toString()));
          }

          rnd = new Random ();
          for (int count= maxRepetitions; count > 0; --count) {
            String s = list.get(rnd.nextInt(list.size()));
            Assert.assertEquals(s, interner.intern(s));
          }

        }
      });

    return System.currentTimeMillis() - start;
  }


  private void runInParallel (int maxThreads, final Runnable runnable) {
    int threads = maxThreads;
    final RuntimeException[] rex = new RuntimeException[maxThreads];
    final CyclicBarrier cbstart = new CyclicBarrier(threads);
    final CyclicBarrier cbend = new CyclicBarrier(threads+1);

    while (--threads>=0) {
      final int reidx = threads;
      new Thread (new Runnable() {
        @Override
        public void run() {
          try {
            cbstart.await();
          }
          catch (InterruptedException ignore) {}
          catch (BrokenBarrierException ignore) {}

          try {
            runnable.run();
          }
          catch (RuntimeException re) {
            rex[reidx] = re;
          }
          catch (Error er) {
            rex[reidx] = new RuntimeException(er);
          }

          try {
            cbend.await();
          }
          catch (InterruptedException ignore) {}
          catch (BrokenBarrierException ignore) {}
        }
      }).start ();
    }

    try {
      cbend.await();
    }
    catch (InterruptedException ignore) {}
    catch (BrokenBarrierException ignore) {}

    // propagate exceptions
    List<RuntimeException> rexlist = new ArrayList<RuntimeException>();
    for (int i=rex.length-1; i>=0; --i) {
      if (rex[i] != null) {
        rexlist.add(rex[i]);
      }
    }
    if (rexlist.size() == 1) {
      throw rexlist.get(0);
    }
    if (rexlist.size() > 1) {
      for(RuntimeException re: rexlist) {
        re.printStackTrace();
      }
      throw new CompositeRuntimeException(rexlist);
    }
  }

  private long computePerformanceBenchmark (int maxThreads) {
    long start = System.currentTimeMillis();
    final int reps = 150000/maxThreads;

    final List<int[]> list = Collections.synchronizedList(new ArrayList<int[]>());

    runInParallel(maxThreads, new Runnable() {
      @Override
      public void run() {
        Random rnd = new Random();
        for (int count = reps; count > 0; --count) {
          int size = Math.max (20, Math.min(70, (int) (rnd.nextGaussian() * 10. + 50)));
          list.add(new int[size]);
        }
      }
    });

    long alloc = -start + (start = System.currentTimeMillis());

    runInParallel(maxThreads, new Runnable() {
      @Override
      public void run() {
        Random rnd = new Random();
        for (int[] iarr: list) {
          for (int i=0; i<iarr.length; ++i) {
            iarr[i] = rnd.nextInt();
          }
        }
      }
    });

    long filled = -start + (start = System.currentTimeMillis());

    list.clear();
    System.gc();
    System.gc();
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {}
    System.gc();

    return alloc + filled;
  }

  private long computeMedian (LongProducer lp) {
    List<Long> times = new ArrayList<Long>();
    for (int count=8; count>0; --count) {
      times.add(lp.produce());
    }
    Collections.sort(times);
    int middle = times.size()/2;
    return (long) (times.get(middle-1)+times.get(middle))/2;
  }

  private static interface LongProducer {
    public long produce();
  }

  public static class CompositeRuntimeException extends RuntimeException {
    private final List<RuntimeException> myCauses;

    public CompositeRuntimeException (List<RuntimeException> causes) {
      myCauses = causes;
    }

    @Override
    public String toString() {
      return myCauses.toString();
    }
  }

}
