import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {

            int input = scan.nextInt();
            int[] arr = new int[input];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }

            // Sort the array
            Arrays.sort(arr);

            // Find and print the lonely number
            boolean foundLonely = false;
            for (int i = 0; i < arr.length; i++) {
                if ((i == 0 || arr[i] != arr[i - 1]) && (i == arr.length - 1 || arr[i] != arr[i + 1])) {
                    System.out.println(arr[i]);
                    foundLonely = true;
                }
            }

            // If no lonely number is found
            if (!foundLonely) {
                System.out.println("No lonely number found");
            }
        }
    }
}
