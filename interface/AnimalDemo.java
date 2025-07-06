interface Animal {
    String makeSound(String sound); // public+static
}

class Dog implements Animal {

    public String makeSound(String sound) {
        // System.out.println(sound);
        // int a = 10, b = 5;
        // int add = a + b;
        return (sound + " " + sound);
    }
}

class Cat implements Animal {

    public String makeSound(String sound) {
        return (sound + " " + sound);
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println(dog.makeSound("Woof!"));
        System.out.println(cat.makeSound("Meow!"));
    }
}