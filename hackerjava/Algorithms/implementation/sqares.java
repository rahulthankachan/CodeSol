import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int in1 = scanner.nextInt();
            int in2 = scanner.nextInt();
            Double first = Math.sqrt(in1);
            Double second = Math.sqrt(in2);
            int start = first.intValue();
            int end = second.intValue();
            
            if(first > first.intValue() ) {
                start = first.intValue() + 1;
            } else {
                start = first.intValue();
            }
            
            int total = 0;
            for (int j = start; j <= end; j++) {
                total +=1;
            }
            System.out.println(total);
    
            
        }
        
    }
    
    // Take the sqrt of the bounding numbers
    // Give the integers which lie in that range
}
