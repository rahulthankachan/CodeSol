import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n ; i++) {
            int number = scanner.nextInt();
            List<Integer> mList = Solution.extract(number);
            int total = 0;
            for (int x : mList){
                if(number % x == 0) {
                    total += 1;
                }
            }
            
            System.out.println(total);
            
        }
    }
    
    public static List<Integer> extract(int number) {
        List<Integer> mList = new ArrayList<Integer>();
        while (number != 0) {
            int x = number % 10;
            if (x > 0) {
                mList.add(x);
            }
            number /= 10;
            
        }
        
        return mList;
    }
   
        
        
     
}
