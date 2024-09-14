import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){

            int number = scan.nextInt();

            int[][] arr = new int[number][number];

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    arr[i][j] = scan.nextInt();                
                }
            }

            int diagnol1 = 0;
            int diagnol2 = 0;

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (i == j) {
                        diagnol1 += arr[i][j];
                    }
                    if(i + j == number - 1){
                        diagnol2 += arr[i][j];
                    }
                }
            }

            int difference = diagnol1 - diagnol2;
            System.out.println(Math.abs(difference));
        }
    }
}