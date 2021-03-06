package jetbrains.mps.ide.dataFlow.presentation;

/*Generated by MPS */

import java.awt.Graphics;
import java.awt.Color;

public class ReadBlock<T extends IInstruction<T>> extends AbstractBlock<T> {
  public ReadBlock(int x, int y, int width, int height, T source) {
    super(x, y, width, height, source);
  }

  public void paintBlock(Graphics g) {
    g.setColor(new Color(150, 190, 245));
    g.fillRect(this.myX, this.myY, this.myWidth, this.myHeight);
    g.setColor(Color.BLACK);
    g.drawRect(this.myX, this.myY, this.myWidth, this.myHeight);
  }
}
