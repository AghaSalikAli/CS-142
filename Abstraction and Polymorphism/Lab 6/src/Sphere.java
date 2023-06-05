public class Sphere extends Shape{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getVolume() {
        return 4/3 * Math.PI * Math.pow(radius,3);
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius,2);
    }

    public String getShapeType() {
        return "Sphere";
    }

    public String toString () {
      return "Shape Type: " + getShapeType() + "\n" +
              "Radius: " + getRadius() + "\n" +
              "Volume: " + getVolume() + "\n" +
              "Surface Area: " + getSurfaceArea() + "\n";

    }
}
