import java.awt.*;

public class DrawingCanvas extends Canvas {
    public void paint (Graphics g) {
        /*Rectangle (Prob 1)
        Rectangle r1 = new Rectangle(72,120,100,50, Color.cyan, Color.black, 3);
        r1.paint(g);
        Rectangle r2 = new Rectangle(100,240,50,25,Color.cyan,Color.black, 3);
        r2.paint(g);
        Rectangle r3 = new Rectangle(250,300, 200, 100, Color.cyan, Color.black, 3);
        r3.paint(g);
        Rectangle r4 = new Rectangle(500, 500, 200, 300, Color.cyan, Color.black, 3);
        r4.paint(g);
        Rectangle r5 = new Rectangle(750, 200, 100, 150, Color.cyan, Color.black, 3);
        r5.paint(g);*/

        /*Triangle (Prob 2a)
        int [] a = {100,350,450};
        int [] b = {150,450,150};
        Triangle t1 = new Triangle(a,b,Color.red);
        t1.paint(g); */

        /*Quadrilateral (Prob 2b)
        int [] a = {50,50,250,250};
        int [] b = {50,200,200,50};
        Quadrilateral q1 = new Quadrilateral (a,b,Color.pink);
        q1.paint(g); */

       /*Hexagon (Prob 2f)
        int [] a = new int[6];
        int [] b = new int[6];
        int radius = 150;
        int deviation = 50;
        int centerX = getWidth() / 2;     //to get it in centre of canvas
        int centerY = getHeight() / 2;
        for (int n=0; n<6; n++) {
            int x = (int)((radius + Math.random() * deviation) * Math.cos(Math.toRadians(90 + n * 60))) + centerX;
            a[n] = x;
            int y = (int)((radius + Math.random() * deviation) * Math.sin(Math.toRadians(90 + n * 60))) + centerY;
            b[n] = y;
        }
        Hexagon h1 = new Hexagon(a,b,Color.blue);
        h1.paint(g); */

       /*Pentagon (Prob 2c)
        int [] a = new int[5];
        int [] b = new int[5];
        int radius = 150;
        int deviation = 50;
        int centerX = getWidth() / 2;    //to get it in centre of canvas
        int centerY = getHeight() / 2;
        for (int n=0; n<5; n++) {
            int x = (int)((radius + Math.random() * deviation) * Math.cos(Math.toRadians(90 + n * 72))) + centerX;
            a[n] = x;
            int y = (int)((radius + Math.random() * deviation) * Math.sin(Math.toRadians(90 + n * 72))) + centerY;
            b[n] = y;
        }
        Pentagon p1 = new Pentagon(a,b,Color.green);
        p1.paint(g); */

        /*Regular Hexagon (Prob 2g)
        int [] a = new int[6];
        int [] b = new int[6];
        int radius = 150;
        int centerX = getWidth() / 2;    //to get it in centre of canvas
        int centerY = getHeight() / 2;
        for (int n=0; n<6; n++) {
            int x = (int)(radius * Math.cos(Math.toRadians(90 + n * 60))) + centerX;
            a[n] = x;
            int y = (int)(radius * Math.sin(Math.toRadians(90 + n * 60))) + centerY;
            b[n] = y;
        }
        RegularHexagon rh1 = new RegularHexagon(a,b,Color.GRAY);
        rh1.paint(g);*/

       /*Regular Pentagon (Prob 2d)
        int [] a = new int[5];
        int [] b = new int[5];
        int radius = 150;
        int centerX = getWidth() / 2;    //to get it in centre of canvas
        int centerY = getHeight() / 2;
        for (int n=0; n<5; n++) {
            int x = (int)(radius * Math.cos(Math.toRadians(90 + n * 72))) + centerX;
            a[n] = x;
            int y = (int)(radius * Math.sin(Math.toRadians(90 + n * 72))) + centerY;
            b[n] = y;
        }
        RegularPentagon rp1 = new RegularPentagon(a,b,Color.magenta);
        rp1.paint(g);*/

        /*Pentagram (Prob 2e)
        int [] a = new int[5];
        int [] b = new int[5];
        int [] c = new int[15];      //array for all x-coordinates of 5 triangles
        int [] d = new int[15];      //array for all y-coordinates of 5 triangles
        int radius = 150;
        int centerX = getWidth() / 2;    //to get it in centre of canvas
        int centerY = getHeight() / 2;
        for (int n=0; n<5; n++) {
            int x = (int)(radius * Math.cos(Math.toRadians(90 + n * 72))) + centerX;
            a[n] = x;
            int y = (int)(radius * Math.sin(Math.toRadians(90 + n * 72))) + centerY;
            b[n] = y;
        }
        //using 0,1 then 1,0 then 1,2 and so on until 4,0...points of pentagon
        for (int i=1; i<5; i++) {
            c[3*i-1] = (int)((a[i-1] + a[i])/2 - 0.8660254 * (b[i-1] - b[i]));   //calculation to get 3rd x coordinate of each triangle converted in radians
            d[3*i-1] = (int)((b[i-1] + b[i])/2 + 0.8660254 * (a[i-1] - a[i]));   ////calculation to get 3rd y coordinate of each triangle converted in radians
        }
        c[14]=(int)((a[4] + a[0])/2 - 0.8660254 * (b[4] - b[0]));
        d[14]=(int)((b[4] + b[0])/2 + 0.8660254 * (a[4] - a[0]));

        for (int i=0; i<5; i++) {     //adding the 2 pentagon coordinates that are also 2 coordinates of triangle
            c[3*i]=a[i];
            d[3*i]=b[i];
        }
        for (int i=1; i<5; i++) {    //adding the 2 pentagon coordinates that are also 2 coordinates of triangle
            c[3*i-2]=a[i];
            d[3*i-2]=b[i];
        }
        c[13]=a[0];
        d[13]=b[0];

        //Now c and d arrays have x,y coordinates of all 5 triangles in multiples of 3

        Pentagram pg1 = new Pentagram(a,b,Color.magenta,c,d, Color.green);
        pg1.paint(g);*/

    }
}
