import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){

            long[] numArray = new long[5];

            for (int i = 0; i < numArray.length; i++) {
                numArray[i] = scan.nextLong();
            }

            
            ArrayList<Long> resultArray = new ArrayList<>();

            for (int i = 0; i < numArray.length; i++) {
                long sum = 0;
                for (int j = 0; j < numArray.length; j++) {

                    if(i != j){
                        sum += numArray[j];
                    }
                }

                resultArray.add(sum);
            }

            long minSum = Collections.min(resultArray);
            long maxSum = Collections.max(resultArray);

            System.out.println(minSum + " " + maxSum);
            


        }
    }
}