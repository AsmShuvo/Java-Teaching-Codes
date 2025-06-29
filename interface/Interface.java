interface A {
    int a = 10; // final/const

    void show(); // public
}

class B implements A {
    // a
    public void show() {
        System.out.println("A= " + a);
    }
}

public class Interface {
    public static void main(String[] args) {
        B b = new B();
        // b.a++; // error: because the variables of interfaces are final
        b.show();
    }
}