import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int m = 0; m < n; m++){
            int length = scanner.nextInt();
            StringBuilder st = new StringBuilder();
            for (int j = 0; j < length ; j++) {
                    st.append("5");
            }
            if (length % 3 == 0) {
                System.out.println(st.toString());
                continue;

            } else {
                if (length < 5) {
                    System.out.println(-1);
                    continue;
                } else {
                    
                    String mine  = st.toString();
                    int flag1 = -1;
                    while(canAppend(mine) == true) {
                        mine = append3(mine);
                        if (condition(mine) == true) {
                            System.out.println(mine);
                            flag1 = 1;
                            break;
                        }
                    }
                    
                    if (flag1 == -1) {
                        System.out.println(-1);
                    }
                    
                }
                  
            }
            
        }
    }
    
    public static String append3(String s) {
       
        String finalS = "";
        int index = s.indexOf('3');
        if (index == -1) {
            finalS = s.substring(0, s.length() - 5) + "33333";
        } else {
            int first = index - 5;
            finalS = s.substring(0,first) + "33333" + s.substring(index);
            
        }
       //System.out.println("append3 " + finalS);
        return finalS;
    }
    
    public static boolean condition(String s) {
        int number3 = 0;
        int number5 = 0;
        for (int i = 0; i < s.length(); i++ ) {
            if (s.charAt(i) == '3') {
                number3 += 1;
            } else {
                number5 += 1;
            }
        }
        if ((number3 % 5) == 0 && (number5 % 3) ==0) {
            return true;
        }
        return false;
    }
    
    public static boolean canAppend(String s) {
        int i = s.indexOf('3');
        if (s.length() < 5 && i == -1) {
            return false;
        }
        if (i == -1 && s.length() >= 5) {
            return true;
        }else {
            String m = s.substring(0, i);
            if (m.length() >= 5) {
                return true;
            } else {
                return false;
            }
        }
    }
}
                        
