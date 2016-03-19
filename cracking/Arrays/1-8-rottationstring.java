public class TestPad {
    public static void main(String[] args) {


        TestPad test = new TestPad();
        String original = args[0];
        String rotation = args[1];
        System.out.println("The string is a rotation " + test.isSub(original + original, rotation));



    }



    public boolean isSub(String s, String sub) {
        
        if (s.contains(sub)) {
         String rest = s.substring(0, s.indexOf(sub)) + s.substring(s.indexOf(sub) + sub.length(), s.length());
         System.out.println("The rest of the string is " + rest);

        if (s.indexOf(sub) != -1 && rest.equals(s.substring(0, s.length()/2))) {
            return true;
        }


        }

        return false;
    }
}


/*

To check if another string is a rotation of the other


*/
