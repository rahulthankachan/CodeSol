import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class TestPad {
    public static void main(String[] args) {

        String str1 = args[0];
        String str2 = args[1];
        System.out.println(Compare.compare(str1, str2));


        /// Using the Sorting method

    }

}


class Compare{


    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        return sort(a).equals(sort(b));
    }

    public static String sort(String str) {
        char[] val = str.toCharArray();
        Arrays.sort(val);
        return new String(val);
    }
}


/*

Should e consider the whitespaces?
is capital letters also included?


    One is a permuation of the other

  1. When the size is the same
  2. The jumbling is done thats all
  3. Reaaranging the initial character thats all


