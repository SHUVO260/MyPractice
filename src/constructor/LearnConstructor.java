package constructor;


import method.LeranMethod;

public class LearnConstructor {
// Constructor Name will be same as Class Name.
// Constructor Has no Return Type
// Constructors are used to initialize the object.
// Before creating Parameterize constructor we must have to create Default constructor

// Deafult/ non Parametarized Constructor
// Parameterized Constructor

// AccessModifier className(){ }
    String name;
    String address;
    int age;
    double courseFee;
   public LearnConstructor(){ //default constructor
       System.out.println("This is my default Constructor.");
   }
    // Single paremeterized
    public LearnConstructor(String Name){
        this.name=Name;
        System.out.println(this.name);
    }
    //multiple parameterized
    public LearnConstructor(String name,String address){
        this.name=name;
        this.address=address;

        System.out.println(this.name+" "+this.address+" "+this.age);
    }
    public LearnConstructor(String name,String address,int age){
        this.name=name;
        this.address=address;
        this.age=age;
        System.out.println(this.name+" "+this.address+" "+this.age);
    }
    //// Parameter signature pattern is different
    public LearnConstructor(int age,String name,String address){
        this.age=age;
       this.name=name;
        this.address=address;

        System.out.println(this.name+" "+this.address+" "+this.age);
    }
//    public LearnConstructor(int number,String price,String place){ // same pattern so its show error;
//        this.age=number;
//        this.name=price;
//        this.address=place;
//
//        System.out.println(this.name+" "+this.address+" "+this.age);
//    }

    public static void main(String[] args) {
        LearnConstructor learn= new LearnConstructor("James William");  //Argument passing
        learn.address="NY";
        System.out.println("Where are you live" +learn.address);
     LearnConstructor hasan= new LearnConstructor("Mahmud Hasan","Dhaka");
     hasan.age=30;
        System.out.println("Hasan age is"+" "+ hasan.age);
      LearnConstructor dc=new LearnConstructor();
      dc.name="Ahmed";
        System.out.println("My name is"+ dc.name);

    LearnConstructor ahmed= new LearnConstructor("Ahmed","Canada",20);
    ahmed.courseFee=5700;
        System.out.println("Your course fee is"+" "+ ahmed.courseFee);
        ahmed.name="Khan";
        ahmed.courseFee=4550.66;
        ahmed.address="USA";
        ahmed.age=32;
        System.out.println("Student name is"+" "+ ahmed.name+" "+"his coursefee is"+" "+ahmed.courseFee+" "+"his address"+" "+ahmed.address+" "+"his age is"+" "+ahmed.age);

    }

}
