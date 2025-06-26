public class task {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        c.area();
        triange t = new triange(10, 4);
        t.area();
    }
}

abstract class Shape {
    double x, y;

    Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Shape(double r) {
        x = r;
        y = r;
    }

    abstract void area();

}

class Circle extends Shape {
    // double x, y;

    Circle(double r) {
        super(r);
    }

    // override: must
    void area() {
        System.out.println("Area = " + Math.PI * x * x);
    }

}

class triange extends Shape {
    // x,y
    triange(double a, double b) {
        super(a, b);
    }

    // override:
    void area() {
        System.out.println("Area of triangle = " + 0.5 * x * y);
    }
}