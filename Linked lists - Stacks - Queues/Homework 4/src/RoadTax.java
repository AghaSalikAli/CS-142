public class RoadTax {
    private double minValue;
    private double maxValue;

    public RoadTax(double minValue, double maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public double getMinValue() {
        return minValue;
    }

    public double getMaxValue() {
        return maxValue;
    }

    @Override
    public String toString() {
        return "{" +
                "minValue=" + minValue +
                ", maxValue=" + maxValue +
                '}';
    }
}

