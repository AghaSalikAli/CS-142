import java.awt.*;

public class Cell {
    Point topleft;
    int width;
    int height;
    int stroke;
    Color cell_color;
    Color stroke_color;
    String text;
    Font font;
    int fontsize;
    Color textcolor;

    public Cell (int x, int y, int width, int height, Color cell_color, Color stroke_color, int stroke, String text, Color textcolor) {
        topleft = new Point (x,y);
        this.width = width;
        this.height = height;
        this.cell_color = cell_color;
        this.stroke_color = stroke_color;
        this.stroke = stroke;
        this.text = text;
        this.textcolor = textcolor;
    }
    public void paint (Graphics g) {
        Rectangle r1 = new Rectangle(topleft.x, topleft.y, width, height, cell_color, stroke_color, stroke);
        FontMetrics fm = g.getFontMetrics(font);
        while ((fontsize>1) && (fm.stringWidth(text) > width - 2*stroke)) {
            fontsize--;
            font = new Font("Calibri", Font.PLAIN, fontsize);
            g.setFont(font);
            fm = g.getFontMetrics(font);
        }
        r1.paint(g,font,textcolor, text);
    }

    public void paintNormal (Graphics g) {
        Rectangle r1 = new Rectangle(topleft.x, topleft.y, width, height, cell_color, stroke_color, stroke);
        r1.paint(g,font,textcolor, text);
        FontMetrics fm = g.getFontMetrics(font);
       while ((fontsize>1) && (fm.stringWidth(text) > width - 2*stroke)) {
            fontsize--;
            font = new Font("Calibri", Font.PLAIN, fontsize);
            g.setFont(font);
            fm = g.getFontMetrics(font);
        }
        r1.paint(g,font,textcolor, text);
    }

    public void paintHighlighted (Graphics g) {
        Rectangle r1 = new Rectangle(topleft.x, topleft.y, width, height, cell_color, stroke_color, stroke);
        r1.paint(g,font,Color.WHITE,text);
    }
}
