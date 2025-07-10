
class TempCalc extends Human {
    private double temp;

    TempCalc() {
        temp = 0.00;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        if (temp >= 100) {
            System.out.println("WARNING>>>>!");
        }
        this.temp = temp;
    }

}

public class Enc {
    public static void main(String[] args) {
        Human ob = new Human();
        ob.setAge(28);
        ob.setName("Shuvo");

        System.out.println(ob.getAge());
        System.out.println(ob.getName());
    }

}