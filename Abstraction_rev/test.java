public class test {

}

abstract class car {

    abstract void drive();

    void specification() {
        System.out.println("Audi A3");
    }
}

class driver extends car {
    // override (must)
    void drive() {
        System.out.println("I am driving at speed 200kmph");
    }

    public static void main(String[] args) {
        driver d = new driver();
        d.drive();
    }
}
