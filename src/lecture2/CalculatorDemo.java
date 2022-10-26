package src.lecture2;

public class CalculatorDemo {
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();

        int a = 9;
        int b = 5;

        int result1 = calculator.sum(a,b);
        System.out.println("Sum = " + result1);

        int result2 = calculator.substraction(a, b);
        System.out.println("Substraction =" + result2);

        int result3 = calculator.multiplication(a, b);
        System.out.println("Multiplication =" + result3);

        double result4 = calculator.division(a, b);
        System.out.println("Division = " + result4);
    }
}