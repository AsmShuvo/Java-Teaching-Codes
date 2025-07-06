package Pack1;

import pack2.subpack2.TestClass;

public class A {
    int a = 10;

    public void show() {
        System.out.println("A= " + a);
    }

    public static void main(String[] args) {
        TestClass t = new TestClass();
        System.out.println(t.name);
    }
}
