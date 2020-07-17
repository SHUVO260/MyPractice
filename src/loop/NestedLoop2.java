package loop;

import java.util.Scanner;

public class NestedLoop2 {


    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter Your Num");
//        int numOfRaw= input.nextInt();
       int numOfRaw=3;
        for(int i=1; i<=numOfRaw; i++ ){

            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }
}
