
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String longest = "";
        int longestName = 0;

        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            
            String[] part = input.split(",");
            if(longestName<part[0].length()){
                longestName = part[0].length();
                longest = part[0];
            }

            sum += Integer.parseInt(part[1]);
            count++;
        }

        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (1.0*sum/count));
    }
}
