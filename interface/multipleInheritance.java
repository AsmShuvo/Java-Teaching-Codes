interface A {
    void show();
}

interface B {
    void show();

    void display();
}

public class multipleInheritance implements A, B {

    public void show() {
        System.out.println("Show");
    }

    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {
        multipleInheritance m = new multipleInheritance();
        m.show();
        m.display();
    }
}
