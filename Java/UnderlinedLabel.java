import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JLabel;

class UnderlinedLabel extends JLabel {
  public UnderlinedLabel() {
    this("");
  }

  public UnderlinedLabel(String text) {
    super(text);
  }

  public void paint(Graphics g) {
    Rectangle r;
    super.paint(g);
    r = g.getClipBounds();
    g.drawLine(0, r.height - getFontMetrics(getFont()).getDescent(), getFontMetrics(getFont())
        .stringWidth(getText()), r.height - getFontMetrics(getFont()).getDescent());
  }
}