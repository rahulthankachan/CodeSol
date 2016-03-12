import java.io.*;
import java.util.*;

public class Solution {

    public int height = 0;
    public int current = -1;
    
    public Solution(int height) {
        this.height = height;
        this.current = height -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution sol = new Solution(scanner.nextInt());
        String finalString = "";
        for (int i = 1; i <= sol.height; i++) {
            finalString += sol.generateLine(i) + "\n";
        }
        System.out.println(finalString);
        
    }
    
    public String generateLine(int n) {
        int till = height - n;
        String s = "";
        for (int i = 0; i < this.height; i++) {
            if (i >= till) {
                s += "#";
            } else {
                s += " ";
            }
        }
        
        return s;
        
    }
}
