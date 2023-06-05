import java.awt.*;

public class Rectangle {
    Point center;
    int width;
    int height;
    Color button_color;
    Color stroke_colour;
    int stroke;

    public Rectangle(int x, int y, int width, int height, Color button_color, Color stroke_color, int stroke) {
        center = new Point(x,y);
        this.width = width;
        this.height = height;
        this.button_color = button_color;
        this.stroke_colour = stroke_color;
        this.stroke = stroke;
    }

    public void paint (Graphics g) {
        g.setColor(stroke_colour);
        g.fillRect(center.x - width/2 -stroke,center.y - height/2 - stroke,width + stroke*2,height + stroke*2);
        g.setColor(button_color);
        g.fillRect(center.x - width/2,center.y - height/2, width, height);
        g.setColor(Color.black);
        int fontSize = Math.min(width,height)/4;  //to account for rectangles where height is larger than width and scale accordingly
        Font f1 = new Font("TimesRoman", Font.PLAIN, fontSize);
        g.setFont(f1);
        FontMetrics fm = g.getFontMetrics(f1);       //fontmetrics class used to calculate width of text written
        while (fm.stringWidth("Hello World") > width) {  //while loop to ensure written text remains horizontally in bounds of rectangle
            fontSize--;
            f1 = new Font("TimesRoman", Font.PLAIN, fontSize);
            g.setFont(f1);
            fm = g.getFontMetrics(f1);
        }
        int textWidth = fm.stringWidth("Hello World");
        int a = center.x - textWidth/2;
        int b = center.y + fm.getAscent()/2;      //vertically in bound of rectangle
        g.drawString("Hello World", a, b);
    }
}

