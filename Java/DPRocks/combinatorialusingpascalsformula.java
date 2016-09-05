
/*
  This coulution will use the pascals triangle to find the result of the solution.
*/

import java.util.Scanner;

public class TestPad {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (scanner.next().charAt(0) == 'y' || scanner.next().charAt(0) == 'Y') {
      System.out.println("Enter the value for n ");
      int n = scanner.nextInt();
      System.out.println("Enter the value for k ");
      int k = scanner.nextInt();
      System.out.println("The value from the combination function is " + combinatorial(n, k));
    }

  }


  public static long combinatorial(int n, int m) {
    long [][] a = new long[50][50];

    // n -> c 0
    for (int i = 0; i <= n; i++) 
      a[i][0] = 1;       ////// When you choose a {} set
    for (int j = 0; j <= n; j++) 
      a[j][j] = 1;    /// When you are selecting all the elements (n of n)

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < i; j++) {
        a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
      }
    }

    display(a, n);

    return a[n][m];
  }


  public static void display(long[][] a, int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= n; j++) {
        System.out.print(a[i][j] + "\t");
      }
      System.out.println("");
    }
  }
}
