package Encapsulation;
public class encapsulation {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setNums(20, 5);
        System.out.println(c.add());
        System.out.println(c.sub());
        System.out.println(c.mul());
        System.out.println(c.div());
    }
}
