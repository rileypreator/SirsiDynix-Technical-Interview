package questions;

public class Dog {

    public String name;

    public Dog(String name) {
        this.name = name;
    }

    public static void doStuff(Dog d) {
        d = new Dog("Max");
    }

    public static void main(String[] args) {
        Dog d = new Dog("Fido");
        doStuff(d);
        System.out.println(d.name);
    }
}
