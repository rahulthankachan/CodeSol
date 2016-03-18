import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int lengthHighway = scanner.nextInt();
        int n = scanner.nextInt();
        List<Integer> nSegments = new ArrayList<Integer>();
        
        for (int i = 0; i < lengthHighway; i++) {
                nSegments.add(scanner.nextInt());
        }
        
        //System.out.println(Arrays.toString(nSegments.toArray()));
        
        for (int i = 0; i < n; i++) {
            int firstIndex = scanner.nextInt();
            int secondIndex = scanner.nextInt();
            
            
            int maxN = 5;
            for (int in = firstIndex; in <= secondIndex; in++) {
                maxN = Math.min(maxN,nSegments.get(in));
            }
            
            System.out.println(maxN);
        }
            
    }
}




/*

    Create 1 array
    index of the array will be the entry point
    value will be the width of that segment entry
    
     traversal function this will give the max vaue in that range on index
     based on the value display result funtion

*/
