import java.awt.*;

public class Titlebar extends Cell {
    Cell closingbutton;
    public Titlebar () {
        super(50,100,590,100, Color.BLACK, Color.gray, 10, "Data Table", Color.white);
        this.fontsize = 30;
        this.font = new Font("TimesRoman", Font.BOLD, fontsize);
        int buttonWidth = width / 8;
        int buttonHeight = width / 8;
        int buttonX = topleft.x + width - buttonWidth - 10;
        int buttonY = topleft.y + 10;
        closingbutton = new Cell(buttonX, buttonY, buttonWidth, buttonHeight, Color.red, Color.gray, stroke / 3, " ", Color.white);
    }

    public Titlebar (int x, int y, int width, int height, int Stroke, Color titlebar_color, Color titlebarBorder, String title) {
        super(x,y,width,height,titlebar_color,titlebarBorder,Stroke,title,Color.white);
        this.fontsize = 30;
        this.font = new Font("TimesRoman", Font.BOLD, fontsize);
        int buttonWidth = width / 8;
        int buttonHeight = width / 8;
        int buttonX = x + width - buttonWidth - Stroke;
        int buttonY = y + Stroke;
        closingbutton = new Cell(buttonX, buttonY, buttonWidth, buttonHeight, Color.red, titlebarBorder, Stroke / 3, " ", Color.white);
    }
    public void paintDefault (Graphics g) {
        this.paintHighlighted(g);
        closingbutton.paintHighlighted(g);
    }

    public void paintData (Graphics g) {
        FontMetrics fm = g.getFontMetrics(font);       //fontmetrics class used to calculate width of text written
        while (fm.stringWidth(text) > closingbutton.topleft.x-stroke- topleft.x) {  //while loop to ensure written text remains horizontally in bounds of rectangle
            fontsize--;
            font = new Font("TimesRoman", Font.BOLD, fontsize);
            g.setFont(font);
            fm = g.getFontMetrics(font);
        }
        this.paintHighlighted(g);
        closingbutton.paintHighlighted(g);
    }
}
