public class TestPad {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, -2, -4, 0, 10, -45};
    q_sort(a, 0, a.length - 1);
    display(a);
  }

  public static void display(int[] a) {

    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }

  }
  public static void q_sort(int[] a, int low, int high) {
    if (high > low) {
      int pivot = partition(a, low, high);
      q_sort(a, low, pivot - 1);
      q_sort(a, pivot + 1, high);
    }
  }


  public static int partition(int[] a, int low, int high) {
    int firstHigh = low;
    int p = high;
    for (int i = low; i < high; i++) {
      if (a[i] < a[p]) {
        int temp = a[i];
        a[i] = a[firstHigh];
        a[firstHigh] = temp;
        firstHigh += 1;
      }
    }

    int temp = a[firstHigh];
    a[firstHigh] = a[p];
    a[p] = temp;

    return firstHigh;
  }
}

