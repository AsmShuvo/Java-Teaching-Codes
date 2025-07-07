public class Test {
    public static void main(String[] args) {
        int x = 10;
        String name = "shuvo";
        Test t = new Test();
        t.show(name); // name <<
        System.out.println(t.getAge()); // age <<<< terminated....
        t.show(name); // name -not printed
        t.show(name); // name -not printed
        t.show(name); // name -not printed
        t.show(name); // name -not printed
        t.show(name); // name -not printed
        t.show(name); // name -not printed
        t.show(name); // name -not printed
        t.show(name); // name -not printed
        t.show(name); // name -not printed
        t.show(name); // name -not printed
        t.show(name); // name -not printed
    }

    int age = 29;

    int getAge() {
        return (age / 0);
    }

    void show(String name) {
        System.out.println(name);
    }

}