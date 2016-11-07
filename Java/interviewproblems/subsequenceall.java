

/// All subsequence of a word

public class TestPad {
  public static void main(String[] args) {
    String a = "rahul";

    for (int i = 1; i <= a.length(); i++) {
      print("", a, i);
    }

  }

  public static void print(String prefix, String remaining, int size) {
    if (size == 0) {
      // We have found the desired length word
      System.out.println(prefix);
      return;
    }

    if(remaining.length() == 0) {
      return;
    }

    print(prefix + remaining.charAt(0), remaining.substring(1), size - 1);
    print(prefix, remaining.substring(1), size);
  }
}
