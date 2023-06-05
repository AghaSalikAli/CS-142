import java.awt.*;

public class Hexagon extends Polygon {
    Color stroke_color;

    public Hexagon (int [] x, int [] y, Color c) {
        super(x,y,6);
        stroke_color=c;
    }
    public void paint (Graphics g) {
        g.setColor(stroke_color);
        g.fillPolygon(xpoints, ypoints, 6);
    }
}
