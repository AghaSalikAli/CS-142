package Problem1;

public class Animal {

    public String name;
    public String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }
}
