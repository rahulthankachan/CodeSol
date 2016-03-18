import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            int cost = scanner.nextInt();
            int reqWrappers = scanner.nextInt();
            
            int numberInitialChoc = number / cost;
            int wrappers = numberInitialChoc;
            int extraChoc = 0;
            while(wrappers >= reqWrappers) {
                wrappers -= reqWrappers;
                wrappers += 1;
                extraChoc += 1;
                
            }
            
            System.out.println(numberInitialChoc + extraChoc);
            
            
        }
    }
    
    

}


/*
Calculate the chocolates
given so many how many chorco
display total
while (available wrapper > min_to get)

*/
