import java.awt.*;

public class Quadrilateral extends Polygon {
    Color stroke_color;
    public Quadrilateral (int [] a, int [] b, Color c) {
        super(a,b,4);
        stroke_color = c;
    }
    public void paint (Graphics g) {
        g.setColor(stroke_color);
        g.fillPolygon(xpoints, ypoints, 4);
    }
}
