public class test {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        myDog.eat();
        myDog.makeSound();
        myCat.eat();
        myCat.makeSound();
    }
}

abstract class Animal {

    abstract void makeSound(); // I want a makesound method but i dont know the functionality, so i just
                               // created the func and left it as abstract (created by one, developed by other)

    void eat() {
        System.out.println("This animal eats food");
    }

}

// if any class extends Abstract class, it have to complete the abstraction
class Dog extends Animal {
    void makeSound() {
        System.out.println("Ghaw Ghaw ghaw");
    }
    // eat()
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Mew mew mew");
    }
}
