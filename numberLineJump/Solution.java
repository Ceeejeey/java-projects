import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){
           
            int x1 = scan.nextInt();
            int v1 = scan.nextInt();
            int x2 = scan.nextInt();
            int v2 = scan.nextInt();

            if (x1 > x2 && v1 < v2 || x1 < x2 && v1 > v2) {
                System.out.println("YES");
                
            }
            else{
                System.out.println("NO");
            }
           
        }

    }
}