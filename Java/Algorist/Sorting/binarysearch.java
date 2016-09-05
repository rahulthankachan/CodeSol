import java.util.Scanner;

public class TestPad {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Scanner scanner = new Scanner(System.in);
    while (scanner.next().charAt(0) == 'y') {
      System.out.println("Enter the number to be searched ");
      int number = scanner.nextInt();
      System.out.println("The postion is " + b_search(a, number, 0, a.length - 1));
    }

  }


  public static int b_search(int[] a, int key, int low, int high) {

    if (low > high) {
      return -1;
    }

    int mid = (low + high) / 2;
    if (a[mid] == key) {
      return mid;
    } else if (a[mid] > key) {
      return b_search(a, key, low, mid - 1);
    } else {
      return b_search(a, key, mid + 1, high);
    }

  }
}
