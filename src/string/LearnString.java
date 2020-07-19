package string;

public class LearnString {
    public static void main(String[] args) {
        String foodname="American pizza";
        String foodname1="Mexican Pizza";
        System.out.println("Length"+foodname.length());
        System.out.println("Concat"+foodname1.length());
        System.out.println(foodname.equalsIgnoreCase("american pizza"));
        System.out.println(foodname.equals("American pizza"));
        System.out.println(foodname.charAt(4));
    }
}
