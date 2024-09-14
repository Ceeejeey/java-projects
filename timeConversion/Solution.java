import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){

            String inputTime = scan.nextLine();

            String amPm = inputTime.substring(inputTime.length() - 2);
            String hour = inputTime.substring(0 , 2);
            String minute = inputTime.substring(3 , 5);
            String second = inputTime.substring(6 , 8);
            
            

            if(amPm.equals("PM")){

                switch (hour) {
                    case "01" -> hour = "13";
                    case "02" -> hour = "14";
                    case "03" -> hour = "15";
                    case "04" -> hour = "16";
                    case "05" -> hour = "17";
                    case "06" -> hour = "18";
                    case "07" -> hour = "19";
                    case "08" -> hour = "20";
                    case "09" -> hour = "21";
                    case "10" -> hour = "22";
                    case "11" -> hour = "23";
        
                    default -> {}
                    
                }
            }else{

                if(hour.equals("12")){
                    hour = "00";
                }
            }

            System.out.println(hour + ":" + minute + ":" + second);
        }
    }
}