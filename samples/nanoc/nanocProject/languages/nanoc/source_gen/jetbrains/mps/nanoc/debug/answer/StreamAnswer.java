package jetbrains.mps.nanoc.debug.answer;

/*Generated by MPS */


public class StreamAnswer extends GDBAnswer {
  private String myValue;

  public StreamAnswer(char token, String value) {
    super(token);
    myValue = value;
  }

  public String getValue() {
    return myValue;
  }
}
