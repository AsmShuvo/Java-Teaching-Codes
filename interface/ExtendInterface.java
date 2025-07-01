// interface extending interface : inheritance of interface
// access modifiers:  public private default protected
interface Add {
    double add(double a, double b); // public
}

interface Calc extends Add {
    // add
    double sub(double a, double b); // public
}

public class ExtendInterface implements Calc {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        ExtendInterface ob = new ExtendInterface();
        System.out.println(ob.add(1, 2));
        System.out.println(ob.sub(4, 2));
    }
}
