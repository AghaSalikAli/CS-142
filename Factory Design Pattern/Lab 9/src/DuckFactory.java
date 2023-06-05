public class DuckFactory {
    public Duck createDuck(String duckType) {
        if (duckType.equals("MallardDuck")) {
            return new MallardDuck();
        } else if (duckType.equals("RubberDuck")) {
            return new RubberDuck();
        } else if (duckType.equals("DecoyDuck")) {
            return new DecoyDuck();
        } else {
            throw new IllegalArgumentException("Invalid duck type");
        }
    }
}