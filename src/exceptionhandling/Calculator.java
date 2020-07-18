package exceptionhandling;

public class Calculator {
    public static void doDivision(double num1,double num2) {
        double division = num1/num2;
        System.out.println("Total Division value is" + " " + division);
    }
    public static void main(String[] args) {
       doDivision(20,0);
    }
    public static void doDivision(int num1,int num2) {
        int division = num1 / num2;
        System.out.println("Total Division value is" + " " + division);
    }
}
