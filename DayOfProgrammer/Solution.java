import java.util.Scanner;


public class Solution {
	
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		
		int year = scan.nextInt();
		int dayCount = 0;
		int dayOfProgrammer = 0;
		
		if(year <= 1918){
			if(year % 4 == 0){
				dayCount = 31 + 16 + 31 + 30 + 31 + 30 + 31 + 31 ;
				dayOfProgrammer = 256 - 13 - dayCount;
				System.out.println(dayOfProgrammer + ".09." + year);
			}else{
				dayCount = 31 + 15 + 31 + 30 + 31 + 30 + 31 + 31 ;
				dayOfProgrammer = 256 - 13 - dayCount;
				System.out.println(dayOfProgrammer + ".09." + year);
			}
		}else {
		
			if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
				dayCount = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 ;
				dayOfProgrammer = 256 - dayCount;
				System.out.println(dayOfProgrammer + ".09." + year);
			}else{
				dayCount = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 ;
				dayOfProgrammer = 256 - dayCount;
				System.out.println(dayOfProgrammer + ".09." + year);
			}
		}
		
		
        scan.close();
    }
}
