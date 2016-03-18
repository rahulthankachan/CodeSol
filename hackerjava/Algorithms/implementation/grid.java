import java.io.*;
import java.util.*;

public class TestPad {
    
    public static void main(String[] args) throws Exception {
        
        Reader f = new FileReader("test.txt");
        BufferedReader bf = new BufferedReader(f);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(bf.readLine());
        
        
        for (int i = 0; i < n; i++) {
            
            String[] line = bf.readLine().split(" ");
            int rows = Integer.valueOf(line[0]);
            int columns = Integer.valueOf(line[1]);

            
            Grid outer = new Grid(rows, columns);
            
            for (int j = 0; j < rows; j++) {
                line = bf.readLine().split("");
                //System.out.println(Arrays.toString(line));
                for (int m = 0; m < columns; m++) {
                    outer.insertElement(j, m, Integer.parseInt(line[m]));
                }
            }

            line = bf.readLine().split(" ");
            int pattern_rows = Integer.parseInt(line[0]);
            int pattern_col = Integer.parseInt(line[1]);
            
            Grid pattern = new Grid(pattern_rows, pattern_col);
            for (int j = 0; j < pattern_rows; j++) {
                line = bf.readLine().split("");
            
                for (int m = 0; m < pattern_col; m++) {
                  //  System.out.println("Yay2");
                    pattern.insertElement(j, m, Integer.parseInt(line[m]));
                }
            }
            
            int pattern_size = pattern_rows * pattern_col;
            int found = 0;
            int current_c = 0;
            int current_r = 0;
            int current_pc = 0;
            int current_pr = 0;
            int temp = 0;
            int initial_c = 0;
            int initial_r = 0;
                
            while( temp != pattern_size && current_c < outer.columns && current_r < outer.rows && current_pc < pattern.columns 
                 && current_pr < pattern.rows && initial_c < outer.columns && initial_r < outer.rows) {

                try{
                if(outer.getElement(current_r, current_c) == pattern.getElement(current_pr, current_pc)) {
                    if (temp == 0) {
                        initial_c = current_c;
                        initial_r = current_r;
                    }
                    temp += 1;
                  // System.out.println("Element " + outer.getElement(current_r, current_c));
                    
                    current_c += 1;
                    current_pc += 1;
                    
                    if (current_pc == pattern.columns) {
                        current_pc = 0;
                        current_pr += 1;
                        current_r += 1; 
                        current_c -= pattern.columns;
                        if (current_c < 0) {
                            current_c = 0;
                        }
                    }
                    
                    if (current_c == outer.columns) {
                        current_c = 0;
                        current_r += 1;
                    }
                    

                    
                    
                } else {
                    
                    initial_c += 1;
                    temp = 0;
                    current_pr = 0;
                    current_pc = 0;
                    current_c = initial_c;
                    current_r = initial_r;
                    if (current_c == outer.columns) {
                        current_c = 0;
                        current_r += 1;
                        initial_r += 1;
                        initial_c = 0;
                    }
                }
            } catch (Exception e) {
                System.out.println("The current Values are " + current_c + " and " + current_r);
                System.out.println("The current Values Pattern are " + current_pc + " and " + current_pr);
                e.printStackTrace();
                break;
            }
                
               
            }
            //System.out.println("The pattern size is " + pattern_size);
            //System.out.println("The size is " + temp);
            if(temp == pattern_size) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
            //System.out.println(outer.showPretty());
           // System.out.println(pattern.showPretty());
           // System.out.println(outer.showPretty());
            
            
           
            
        }
        
        
    }
}

class Grid {
    int[][] values;
    public int rows = 0;
    public int columns = 0;
    
    public Grid(int x, int y) {
        values = new int[x][y];
        this.rows = x;
        this.columns = y;
    }
    
    public void insertElement(int x, int y, int value) {
        values[x][y] = value;
    }
    
    public int getElement(int x, int y) {
        return values[x][y];
    }
    
    public String showPretty() {
        String s = "";
        for (int i = 0; i < rows; i++) {
            s += Arrays.toString(values[i]) + "\n";
        }
        return s;
    }
    
    
}

/*

Create a grid class 
Small grid
Large grid
rowise equality
columnwise increament

while found or termination condition
current row
current col


*/

