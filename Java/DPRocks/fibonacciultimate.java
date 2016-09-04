import java.util.Scanner;
import java.util.Arrays;

public class TestPad {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.next().charAt(0) == 'y') {
      System.out.println("Enter the n for which you need to find the fibonacci");
      int n = scanner.nextInt();
      System.out.println("The value is " + fibo_ul(n));
    }
  }


  public static long fibo_ul(int n) {
    long back1 = 0, back2 = 1;
    if (n == 0) return 0;

    for (int i = 2; i <=n; i++) {
      long temp = back1;
      back1 = back1 + back2;
      back2 = temp;
    }

    return back1 + back2;
  }
}
