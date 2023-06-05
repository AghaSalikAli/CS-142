package Problem1;

public class Dog extends Animal {
    public Dog(String name, String sound) {
        super(name, sound);
    }

    public void makeSound() {
        System.out.println(name + " barks");
    }
}