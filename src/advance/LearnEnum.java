package advance;

public class LearnEnum {

    public static void main(String[] args) {
        System.out.println(Color.Red);
        Color.colorInfo();
        System.out.println(priority.medium);
        System.out.println(Color.Blue);
        System.out.println(newEnum.No);
    }
public enum priority{
        high, low, medium;
}
public enum newEnum{
        Yes, No;
}
}
