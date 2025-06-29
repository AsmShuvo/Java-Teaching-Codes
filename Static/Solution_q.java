class X {
    static int a;

    static {
        a = -1;
    }

    X() {
        a++;
    }

    static void display() {
        a++;
        System.out.println("Value of a: " + a);
    }
}

public class Solution_q {
    public static void main(String[] args) {
        X obj1 = new X(); // by creating
        X.display(); // or obj1.display()

        X obj2 = new X(); // by creating
        X.display(); // or obj1.display()
    }
}