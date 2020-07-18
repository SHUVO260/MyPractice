package operators;
// + Additive operator
// - Subtraction
// * Multiplication
// / Division
// % Remainder
public class ArithmeticOperator {

    public static void main(String[] args) {
    int num1=60;
    int num2=10;
    int summation=num1+num2;
        System.out.println("Total Sum is:"+" "+summation);
    int subtraction=num1-num2;
        System.out.println("Total sum is:"+" "+subtraction);
    int multiply=num1*num2;
        System.out.println("Total Multiplication is:"+" "+multiply);
    int division=num1/num2;
        System.out.println("Total division is:"+" "+division);

    int remainder=num1%num2; //int num1=60; int num2=10; //int num1=65; int num2=10;

        System.out.println("Total remainder is:"+" "+remainder);
    double num3=40.5;
    double num4=20;
    double remainder1=num3%num4;
        System.out.println("Total remainder value is:"+" "+remainder1);
    }


}
