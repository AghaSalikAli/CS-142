public class Cuboid extends Shape{
   private double length;
   private double breadth;
   private double height;

   public Cuboid (double length, double breadth, double height) {
       this.length = length;
       this.breadth = breadth;
       this.height = height;
   }

    public double getVolume() {
        return length * breadth * height;
    }


    public double getSurfaceArea() {
        return 2*((length*breadth)+(breadth*height)+(length*height));
    }


    public String getShapeType() {
        return "Cuboid";
    }

    public double getBreadth() {
        return breadth;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public String toString () {
        return "Shape Type: " + getShapeType() + "\n" +
                "Length: " + getLength() + "\n" +
                "Breadth: " + getBreadth() + "\n" +
                "Height: " + getHeight() + "\n" +
                "Volume: " + getVolume() + "\n" +
                "Surface Area: " + getSurfaceArea() + "\n";
    }
}
