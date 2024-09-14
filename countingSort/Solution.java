import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){

            int input = scan.nextInt();
            int[] arr = new int[input];
            int[] countArr = new int[100];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }

            for (int i = 0; i < countArr.length; i++) {
                countArr[i] = 0;
            }

            for (int i = 0; i < arr.length; i++) {
                
                countArr[arr[i]] += 1 ;
            }

            for (int index : countArr) {
                System.out.print(index + " ");
            }

        }
    }
}