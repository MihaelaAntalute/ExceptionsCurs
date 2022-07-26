package ExceptionsCurs;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            System.out.println(Calculator.divide(8, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
