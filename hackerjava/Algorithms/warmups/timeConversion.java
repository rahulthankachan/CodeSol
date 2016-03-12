import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.next().split(":");
        String thirdPart = input[2];
        int hours = Integer.parseInt(input[0]);
        String min = input[1];
        String seconds = Solution.getStringFormat(Integer.parseInt(thirdPart.substring(0, thirdPart.length() - 2)));
       
        if ((thirdPart.indexOf("PM") > -1) || (thirdPart.indexOf("pm") > -1)) {
            
            if (hours < 12) {
               hours  += 12;
            }

        }
        
        if ((thirdPart.indexOf("AM") > -1) || (thirdPart.indexOf("AM") > -1) ) {
            if (hours == 12) {
                hours = 0;
            }
        }
        
        String hours24 = getStringFormat(hours);
        
        System.out.println(hours24 + ":" + min + ":" + seconds);
    }
    
    
    public static String getStringFormat(int time) {
        if (time < 10) {
            return "0" + String.valueOf(time);
        }
        
        return String.valueOf(time);
    }
}
