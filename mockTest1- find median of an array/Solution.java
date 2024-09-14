import java.util.*;


public class Solution {
    


    public static int findMedian(int[] arr) {
        Arrays.sort(arr);  // Sort the array

        int n = arr.length;
        // If the array length is odd, return the middle element
        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            // If the array length is even, return the average of the two middle elements
            return (arr[(n / 2) - 1] + arr[n / 2]) / 2;
        }
    }
    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){

            int input = scan.nextInt();

            int[] arr = new int[input];

            for (int i = 0; i < input; i++) {
                arr[i] = scan.nextInt();
            }

            int median = findMedian(arr);

            System.out.println(median);
        }
    }
    
}