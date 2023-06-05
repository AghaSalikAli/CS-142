import java.util.ArrayList;
import java.util.Iterator;

public class t2driver {
    public static void main(String[] args) {
        ArrayList<Shape> shapes= new ArrayList<>();
        shapes.add(new Cuboid(2,3,5));
        shapes.add(new Sphere(4));
        shapes.add(new Cube(4));
        shapes.add(new Cylinder(2,4));
        Iterator<Shape> index =  shapes.iterator();

        while (index.hasNext()) {
           Shape a = index.next();
           System.out.println("Volume:" + a.getVolume());
           System.out.println("Surface Area: " + a.getSurfaceArea());
           System.out.println(a.getShapeType());
           System.out.println(a.getId());
           System.out.println();
       }

    }
}
