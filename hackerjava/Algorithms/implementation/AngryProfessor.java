import java.io.*;
import java.util.*;

public class Solution {
    
    int totalNumber = 0;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        List<StudentClass> sc = new ArrayList<StudentClass>();
        
        for (int i = 0; i < n; i++) {
            StudentClass temp = new StudentClass();
            String inputs[] = scanner.nextLine().split(" ");
            temp.totalStudents = Integer.parseInt(inputs[0]);
            temp.threshold = Integer.parseInt(inputs[1]);
            temp.getAttendence(scanner.nextLine());
            sc.add(temp);
        }
        
        for (StudentClass temp : sc) {
            System.out.println(temp.getResult());
        
        }

        
    }
}
    


class StudentClass {
    public int totalStudents = 0;
    public int threshold = 0;
    public List<Integer> attendence;
    public boolean isCancelled;
    
    public StudentClass() {
        this.attendence = new ArrayList<Integer>();
    }
    public void getAttendence(String attendence) {
        for (String a : attendence.split(" ")) {
            this.attendence.add(Integer.parseInt(a));
        }
    }
    
    public void computeResult() {
        int total = 0;
        for (int i : attendence) {
            if (i <= 0) {
                total += 1;
            }
        }

        if (total >= threshold) {
            isCancelled = false;
        } else {
            isCancelled = true;
        }
    }
    
    public String getResult() {
        computeResult();
        
        if (isCancelled == false) {
            return "NO";
        }
        return "YES";
    }
    
}

