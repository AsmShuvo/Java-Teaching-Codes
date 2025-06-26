// a class can inherit another class that means it will get the attributes of
// that class
// subclass inherits superclass
// overriding
// class A -> show() class -> show()
// - class B extends A : B.show() will show the second one -> same name ->
// - subclass will override its superclass's methods

// super: superclass element/properties access

public class test {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}

class A {
    int x = 10;
    String name = "A_class";

    void show() {
        System.out.println("My name is : " + name);
    }
}

class B extends A {
    int y = 11;
    String name = "B_class"; // overriden

    void show() {
        // overriden
        System.out.println("My name is : " + name);
        System.err.println("My superclass name is: " + super.name);
    }
}