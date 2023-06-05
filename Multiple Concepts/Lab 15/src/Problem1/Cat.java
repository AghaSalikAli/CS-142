package Problem1;

public class Cat extends Animal{

    public Cat(String name, String sound) {
        super(name, sound);
    }

    public void makeSound() {
        System.out.println(name + " meows");
    }
}
