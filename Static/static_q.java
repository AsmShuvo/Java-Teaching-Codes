class test {
    static int a;

    static {
        a = -1; // heap
    }

    test() {
        a++;
    }

    static void display() {
        a++;
        System.out.println("Value of a: " + a);
    }
}
public class static_q {
    public static void main(String[] args) {
        test t1 = new test();
        test t2 = new test();
        test.display();
        t1.display();
        t2.display(); 
    }
}