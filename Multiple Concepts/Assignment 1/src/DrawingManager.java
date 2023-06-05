import java.awt.*;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
  
public class DrawingManager {
        public static void main(String[] args) throws FileNotFoundException {
			JFrame frame=new JFrame();
	        frame.setSize(750,750);
			DrawingCanvas canvas=new DrawingCanvas();
			frame.setVisible(true);
			frame.add(canvas);
		}
}  