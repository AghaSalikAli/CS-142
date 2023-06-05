public class Car {
    private String ModelName;
    private double Price;
    private double NewPriceRw;
    private RoadTax roadTax;
    private String BodyType;
    private String Transmission;
    private Integer NumOfSeats;
    private String Segment;
    private String Introduction;
    private Boolean instock;

    public Car () {

    }
    public Boolean getInstock() {
        return instock;
    }

    public double getNewPriceRw() {
        return NewPriceRw;
    }

    public double getPrice() {
        return Price;
    }

    public Integer getNumOfSeats() {
        return NumOfSeats;
    }

    public RoadTax getRoadTax() {
        return roadTax;
    }

    public String getBodyType() {
        return BodyType;
    }

    public String getIntroduction() {
        return Introduction;
    }

    public String getModelName() {
        return ModelName;
    }

    public String getSegment() {
        return Segment;
    }

    public String getTransmission() {
        return Transmission;
    }

    public void setBodyType(String bodyType) {
        BodyType = bodyType;
    }

    public void setInstock(Boolean instock) {
        this.instock = instock;
    }

    public void setIntroduction(String introduction) {
        Introduction = introduction;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    public void setNewPriceRw(double newPriceRw) {
        NewPriceRw = newPriceRw;
    }

    public void setNumOfSeats(Integer numOfSeats) {
        NumOfSeats = numOfSeats;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setRoadTax(RoadTax roadTax) {
        this.roadTax = roadTax;
    }

    public void setSegment(String segment) {
        Segment = segment;
    }

    public void setTransmission(String transmission) {
        Transmission = transmission;
    }

    @Override
    public String toString() {
        return "{" +
                ModelName + "}";
    }
}
