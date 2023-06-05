import java.awt.*;

public class Pentagram extends Pentagon{
    Color triangle_color;
    int [] triangleXpts;
    int [] triangleYpts;
    public Pentagram(int[] x, int[] y, Color c, int []a, int[]b, Color d) {
        super(x, y, c);
        stroke_color = c;
        triangle_color = d;
        triangleXpts = a;
        triangleYpts = b;
    }
    public void paint (Graphics g) {
        g.setColor(stroke_color);
        g.fillPolygon(xpoints, ypoints, 5);
        g.setColor(triangle_color);
        int [] triangleX = new int[3];
        int [] triangleY = new int[3];
        for (int i=0; i<5; i++) {      //Nested for loops to make 5 triangles one by one taking 3 coordinates at a time
            for (int j =0; j<3; j++) {
                triangleX[j]=triangleXpts[3*i+j];
                triangleY[j]=triangleYpts[3*i+j];
            }
            g.fillPolygon(triangleX, triangleY, 3);
        }

    }
}
