import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPad {

  public static void main(String[] args) {

    ArrayList<String> result = new ArrayList<String>();

    String s = "abcd";
    for (int i = 1; i <= 4; i++) {
      print("", s, i, result);
    }

    System.out.println(Arrays.toString(result.toArray()));

  }


  public static void print(String prefix, String remaining, int k, List<String>result) {
    if (k == 0) {
      //System.out.println(prefix);
      result.add(prefix);
      return;
    }

    if(remaining.length() == 0) {
      return;
    }

    print(prefix + remaining.charAt(0), remaining.substring(1), k - 1, result);
    print(prefix, remaining.substring(1), k, result);
  }
}
