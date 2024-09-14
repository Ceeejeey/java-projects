import java.util.Scanner;

public class Solution {

    public static void main(String[] args){

        try (Scanner scan = new Scanner(System.in)) {
            int input = scan.nextInt();
            int[] numArray = new int[input];
            
            for (int i = 0; i < numArray.length; i++) {
                numArray[i] = scan.nextInt();
            }
            
            double positive = 0;
            double zero = 0 ;
            double negative = 0;
            
            for (int number : numArray) {
                if (number == 0) {
                    zero++;
                }
                else if(number > 0){
                    positive++;
                }
                else{
                    negative++;
                }
            }
            
            System.out.printf("%.6f%n", positive / numArray.length);
            System.out.printf("%.6f%n", negative / numArray.length);
            System.out.printf("%.6f%n", zero / numArray.length);
        }
    }
}