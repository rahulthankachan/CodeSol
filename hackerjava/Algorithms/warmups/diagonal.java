import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumM = 0;
        int sumS = 0;
        
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = scanner.nextInt();
                if (i == j) {
                    sumM += value;
                }
                if ((i + j) == n-1) {
                    sumS += value;
                }
            }
        }
        
        System.out.println(Math.abs(sumM - sumS));
       
    }
}
