package loop;

public class NewLoop {
    public static void main(String[] args) {
//        for(int i=0; i<3; i++){
//            System.out.println("Value of i "+ i);
//            for(int j=1; j<=3; j++){
//                System.out.println("value of j "+ j);
//                System.out.println();
//            }
//        }

        for ( int i=0; i<3;i++) {
            System.out.println("value of i " + i);
            for (int j=1; j<=3; j++)
                System.out.println( "value of j "+ j);
            System.out.println();
        }
    }
}
