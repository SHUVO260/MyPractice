package loop;

import java.util.Scanner;

public class NestedLoop {
    // User will give the number and it will print as a Row Basis
    // Output
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    // 1 2 3 4 5 6
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Your Number");
        int numOfRaw= input.nextInt();

    for (int i=1; i<=numOfRaw; i++){
        for(int j=1; j<=i; j++){

            System.out.print(j+" ");
        }
        System.out.println();
        }
    }

}




