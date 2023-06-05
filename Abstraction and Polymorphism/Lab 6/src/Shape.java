public abstract class Shape {
    private static int numShapes;
    private int id;

    public Shape () {
        numShapes++;
        id = 10000 + numShapes;
    }

    public int getNumShapes() {
        return numShapes;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "numShapes: " + "\n"
                + "id: " + id + "\n";
    }
    public abstract double getVolume();
    public abstract double getSurfaceArea();
    public abstract String getShapeType();

}
