package operators;

public class ConditionalOperator {
    // && Conditional AND: all condition must to be true
    // || Conditional OR: if one condition is true then block of code will execute
    // pipe ||
    // false || false=false
    // false || true=true
    // true || false=true
    // true || true=true

    public static void main(String[] args) {
        int num1=65;
        int num2=40;
        if(num1==num2){
            System.out.println("Num1 and Num2 is equal"); // if true then this sout will print
        }
        if (num1==65 && num2==40){ // all condition must have to be true in &&  and operator
            System.out.println("We like PnT");
        }
        //if one condition is true then Block of code will execute
        if(num1==65 || num2==40){
            System.out.println("We like to do mentoring to be confident");
        }
    }


}
