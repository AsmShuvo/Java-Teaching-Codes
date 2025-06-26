public class MultiLevelInheri {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}

class A {
    int x = 1;

    void show() {
        System.out.println(x);
    }
}

// subclass
class C extends B {
    int z = 3;

    void show() {
        System.out.println(z);
        System.out.println(super.y);
        System.out.println(super.x);
    }
}

class B extends A {
    int y = 2;

    void show() {
        System.out.println(y);
    }
}

// multilevel inh possible but multiple inh impossible