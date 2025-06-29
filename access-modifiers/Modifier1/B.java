package Modifier1;

public class B extends A {
    // show()
    void display() {
        show();
    }

    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
