class Student {
    String name;
    int roll;
    static String univ = "UK University"; /*
                                           * optimized : as it will take place only in heap memory instead of being
                                           * copied by
                                           * others but accessible by all its objects
                                           */

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void showStdDetails() {
        System.out.println("Student name: " + name + "\nStudents roll no: " + roll + "\nUniversity: " + univ + "\n");
    }
}

class Counter {
    static int count = 0; // static is stored in heap so if an object of it menipulates it, it will be
                          // manipulated
                          // permanently

    Counter() {
        count++;
        System.out.println(count);
    }
}

class Box {
    double h = -1, w = -1, d = 1;

    static int level = 1;

    static void show() {
        System.out.println("i am box");
        System.out.println(level);
        // System.out.println(h); // static method can only access static var/ method :
        // restrictions
        mew();
        // bark(); can't call
    }

    // non-static
    void bark() {
        System.out.println("Ghaw ghaw");
    }

    // stack
    static void mew() {
        System.out.println("Mew mew");
    }

    // static block: static block is a special code block that is executed when the class is first loaded into memory, before any objects are created or any methods are invoked.
    static {
        level = 0;
        System.out.println("I am Box class");
    }
}

public class Static {
    public static void main(String[] args) {
        // Student s1 = new Student("Mahdy", 1); // copy create
        // Student s2 = new Student("Abir", 12);
        // Student s3 = new Student("Shuvo", 70);
        // s1.showStdDetails();
        // s2.showStdDetails();
        // s3.showStdDetails();

        // Counter c1 = new Counter(); //
        // Counter c2 = new Counter(); //
        // Counter c3 = new Counter(); //
        // run the code to see the change of value

        // Box b = new Box();
        // b.show() : waste of memory+time
        // className.methodName()/varName; we dont need to create any object for calling
        // static
        // methods/var
        Box.show(); // direct call
        System.out.println(Box.level);
    }
}

/*
 * static var - why? # using heap memory,
 * static var - use case # counter
 * static mehtod & call :className.varName / className.methodName()
 * static restrictions : static methods can't access non-static var/method, bcz
 * static provides u the functionality to use that properties without creating
 * any objects. But, if java allowed accessing non-static from static, every
 * thing would become accessible without creating any object
 * 
 */
