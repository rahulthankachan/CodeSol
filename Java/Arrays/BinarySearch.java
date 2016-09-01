public class TestPad {

  public static void main(String[] args) {

    int[] a = new int[10];
    for (int i = 0; i < 10; i ++) {
      a[i] = i;
    }
    System.out.println("The vaue is there? " + binarySearch(a, 0, 10, 2));


  }

  public static boolean binarySearch(int[] a, int low, int high, int value) {
    if (low > high) {
      return false;
    }

    int m = (high + low) / 2;

    if (a[m] == value) {
      return true;
    } else if (a[m] > value) {
      return binarySearch(a, low, m - 1, value);
    } else {
      return binarySearch(a, m + 1, high, value);
    }

  } 
}
