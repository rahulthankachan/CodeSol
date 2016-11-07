
/*
Next String in the Lexicographic order
Next permutation
Author: Rahul Thankachan
*/

public class TestPad {
  public static void main(String[] args) {
    String a = "12345";
    get_Next(a.toCharArray());

  }


  public static void get_Next(char[] s) {
    int k = s.length - 1;

    while(k > 0) {
      if (s[k - 1] > s[k])
          k --;
      else 
        break;
    }


    if (k <= 0) {
      System.out.println("No further permutaion is possible!");
      return;
    }

    int pivot = k - 1;
    int index = findMinGreater(s, pivot);

    /// Swap these value
    char t = s[pivot];
    s[pivot] = s[index];
    s[index] = t;

    reverse(s, pivot + 1, s.length - 1);

    System.out.println("The next string is " + new String(s));

  }



  public static int findMinGreater(char[] s, int k) {

    int i = k + 1;
    while((i < s.length) && s[i] > s[k])
      i++;

    return i - 1;
  }


  public static void reverse(char[] s, int start, int end) {
    while(start <= end) {
      char t = s[start];
      s[start] = s[end];
      s[end] = t;
      start ++;
      end--;
    }
  }


}



