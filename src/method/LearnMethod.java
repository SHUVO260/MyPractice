package method;

public class LearnMethod {
    // Method: block of code which runs when it is called. Method is used to perform
    // certain actions and they are known as function
    // Method Type:
    // Return Method
    // Non Return Method
    // Return Method without Parameter:
    // Return Method with Parameter:
    // Non Return Method without Parameter:
    // Non Return Method with Parameter:

    // Method Syntax: AccessModifier ReturnType/MethodType MethodName(){ Method Body
    // }
    // ReturnType/MethodType : Data Type/Class Type/ Object
    // MethodName: verb+Noun

    //Return type method without Parameter
    public int doSummation(){
    int number1=20;
    int number2=30;
    int sum=number1+number2;
        System.out.println("Total Summation is"+" "+sum);
    return sum;
    }
    //Return type method with Parameter
    public int doSubtraction(int num1,int num2){
        int number1=num1;
        int number2=num2;
        int sub=number2-number1;
        //System.out.println("Total Subtraction is"+" "+sub);
        return sub;
    }
    public String stInfo(String fName,String lName, int age ){
    String fullName=fName+" "+lName;
        System.out.println("Full name:"+" "+fullName+" "+"Age:"+" "+age);
        return fullName;
    }
    // Non Return Method without Parameter:
    public void doMultiply(){
        int number1=20;
        int number2=30;
        int multiply=number1*number2;
        System.out.println("Total Multiply value is"+" "+multiply);
    }
    //Non Return Method with Parameter:
    public void doMultiply(int num1,int num2){
        int multiply=num1*num2;
        System.out.println("Total Multiply value is"+" "+multiply);
    }
    public void doDivision(int num1,int num2){
        int division=num2/num1;
        System.out.println("Total Division value is"+" "+division);
    }




    public static void main(String[] args) {
    //LearnMethod.stInfo();
    LearnMethod obj=new LearnMethod();
    obj.doSummation();
    obj.doSubtraction(50,250);
    obj.doSubtraction(20,200);
    obj.doSubtraction(30,230);
    obj.stInfo("Khairul","Alam",35);
    obj.doMultiply();
    obj.doMultiply(20,20);
    obj.doDivision(10,20);
        System.out.println("*******************************");
        int subT=obj.doSubtraction(20,50);
        int total=subT+90;
        System.out.println("Total value is:"+" "+total);


    }

}
