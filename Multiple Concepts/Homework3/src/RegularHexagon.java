import java.awt.*;

public class RegularHexagon extends Hexagon{

    public RegularHexagon(int[] x, int[] y, Color c) {
        super(x, y, c);
    }
    public void paint (Graphics g) {
        g.setColor(stroke_color);
        g.fillPolygon(xpoints, ypoints, 6);
    }
}
