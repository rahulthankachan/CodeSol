public class TestPad {

  public static void main(String[] args) {

    Integer[] a = new Integer[50];
    a[0] = Integer.MIN_VALUE;
    int count = 1;
    for (int i = 10; i > 0; i --) {
      a[count] = i;
      count += 1;
    }

    q_sort(a, count);
    display(a, count);

  }


  public static void q_sort(Integer[] a, int count) {

    for (int i = 2; i < count; i++) {
      int j = i;
      while(a[j -1] > a[j]) {
        int temp = a[j - 1];
        a[j - 1] = a[j];
        a[j] = temp;
        j -= 1;
      }
    }
  }

  public static void display(Integer[] a, int count) {
    for (int i = 0; i < count; i++) {
      System.out.print(a[i] + " ");
    }
  }


}
