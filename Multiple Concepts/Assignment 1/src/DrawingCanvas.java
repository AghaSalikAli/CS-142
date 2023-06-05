import java.awt.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DrawingCanvas extends Canvas {
    public void paint(Graphics g) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Please give correct filename");
        String filepath = sc.next();
        System.out.println("Please give titlebar colour");
        Color a = (Color)sc.next();*/
        try { //data.txt is empty and will give you default table
            Table t = new Table("realdata.txt",Color.BLACK,Color.CYAN,Color.pink,Color.magenta,Color.green,Color.BLACK);
            if (!t.checkIfEmpty())
                t.paintDefault(g);
            else
                t.paintData(g);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
