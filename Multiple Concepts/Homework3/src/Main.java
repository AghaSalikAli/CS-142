import javax.swing.*;

public class Main {
    public static void main (String [] args) {
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setVisible(true);
        DrawingCanvas canvas = new DrawingCanvas();
        frame.add(canvas);
    }
}
