public class driver2 {
    public static void main(String[] args) {
        DuckFactory duckFactory = new DuckFactory();
        Duck duck1 = duckFactory.createDuck("MallardDuck");
        Duck duck2 = duckFactory.createDuck("RubberDuck");
        Duck duck3 = duckFactory.createDuck("DecoyDuck");
        duck1.quack();
        duck1.fly();
        duck2.quack();
        duck2.fly();
        duck3.quack();
        duck3.fly();
    }
}
//Comment for Answer of duck problem:
//Factory design pattern will be used as different variation of ducks..
//...are being created based on their variations..
//..of same attributes for eg the way they make their sound or how they fly.
//subclasses get to control and alter the type of objects being created in the factory class