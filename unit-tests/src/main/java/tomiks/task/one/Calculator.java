package tomiks.task.one;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Calculator {

    public Arithmetic arithmetic;

    private double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public double sqrt(double a) {
        return pow(a, 0.5);
    }

    public double sumTwoNumbers(double a, double b) {
        return arithmetic.add(a, b);
    }

    public double divideTwoNumbers(double a, double b) throws ArithmeticException {
        return arithmetic.divide(a, b);
    }

}
