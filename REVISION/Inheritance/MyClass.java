class A {
    A() {
        System.out.println("This is class A");
    }

    static int a;
    { // static block
        a = 1;
    }

    static String getClassName() {
        return "A";
    }

    void show() {
        System.out.println("a= " + a);
    }

    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}

final class B extends A {

}

public class MyClass {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        // A a = new A();
        // System.out.println(A.getClassName());
        System.out.println(B.getClassName());
        System.out.println(B.a);
    }
}
