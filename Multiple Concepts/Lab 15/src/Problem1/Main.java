package Problem1;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Bobo", "Barks");
        Animal cat = new Cat("Meme", "Meows");

        dog.makeSound();
        cat.makeSound();
    }
}