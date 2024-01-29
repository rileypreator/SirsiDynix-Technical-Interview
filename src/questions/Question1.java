package questions;

// Example interface
interface Animal {

    // Example default method that will be implemented in every class by default
    public default void eat()
    {
        System.out.println("I am eating my food.");
    }

    // Example abstract method that will be defined in class below
    public void makeNoise();

    // Example abstract method that will be defined in class below
    public void displaySize();
}

// Example class
class Cow implements Animal {

    // Implementation of abstract method from interface
    @Override
    public void makeNoise() {
        System.out.println("Mooooo!");
    }

    // Implementation of abstract method from interface
    @Override
    public void displaySize() {
        System.out.println("The cow is 40 inches long.");
    }
}

// Another example class with an example of overriding the default method
class Snake implements Animal {

    // Implementation of abstract method from interface
    @Override
    public void makeNoise() {
        System.out.println("Hsssss...");
    }

    // Implementation of abstract method from interface
    @Override
    public void displaySize() {
        System.out.println("The snake is 15 inches long.");
    }

    // Implementation of default method from interface
    @Override
    public void eat() {
        System.out.println("I only swallow my food!");
    }
}

public class Question1 {
    public static void answer() {
        // Create a cow
        Cow milky = new Cow();

        // Abstract methods defined in class
        milky.makeNoise();
        milky.displaySize();

        // Default method defined in interface
        milky.eat();

        // Create a snake
        Snake nagini = new Snake();

        // Abstract methods defined in class
        nagini.makeNoise();
        nagini.displaySize();

        // Default method defined in class
        nagini.eat();
    }
}
