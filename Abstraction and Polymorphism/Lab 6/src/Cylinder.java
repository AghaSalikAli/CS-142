public class Cylinder extends Shape{
    private double height;
    private double radius;

    public Cylinder (double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
    public double getVolume() {
        return Math.PI * Math.pow(radius,3) * height;
    }

    public double getSurfaceArea() {
        return 2*Math.PI*radius*(radius+height);
    }

    public String getShapeType() {
        return "Cylinder";
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return "Shape Type: " + getShapeType() + "\n" +
                "Height: " + getHeight() + "\n" +
                "Radius: " + getRadius() + "\n" +
                "Volume: " + getVolume() + "\n" +
                "Surface Area: " + getSurfaceArea() + "\n";
    }
}
