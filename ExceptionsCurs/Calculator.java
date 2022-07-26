package ExceptionsCurs;

public class Calculator {
    public static int divide(int firstNumber,int secondNumber) throws ArithmeticException{
        if (secondNumber == 0){
            throw new ArithmeticException("you cannot divide by 0");
        }
        int division = firstNumber/secondNumber;
        return division;
    }
}
