package loop;
// #2 Write a program in Java to make such a pattern like
// right angle triangle with number increased by 1.The pattern like
public class LoopChallange {

    public static void main(String[] args) {
        int height = 5;
        int count = 1;
        for (int i =1; i< height +1; i++) {
         for(int j=0; j<i; j++){
             System.out.print(count +" ");
             count++;
         }
            System.out.println();
        }
    }
}