import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int m = 0; m < n; m++) {
            int cycles = scanner.nextInt();
            int initial = 1;
            while(cycles > 0) {
                initial *= 2;
                cycles --;
                if (cycles ==0) {
                    break;
                }
                initial += 1;
                cycles --;
                
            }
            
            System.out.println(initial);
            
        }
        
    }
    
   
}
