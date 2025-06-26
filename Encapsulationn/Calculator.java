public class Calculator {
    private double n1, n2;

    public void setNums(double num1, double num2) {
        n1 = num1;
        n2 = num2;
    }

    public double add() {
        return n1 + n2;
    }

    public double sub() {
        return n1 - n2;
    }

    public double mul() {
        return n1 * n2;
    }

    public double div() {
        if (n2 == 0)
            return Double.NaN;
        return n1 / n2;
    }

}
