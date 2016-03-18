public class TestPad {
    public static void main(String[]  args) {

        String str = args[0];
        int count  = 1;
        char myChar = str.charAt(0);

        StringBuilder strB = new StringBuilder();

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == myChar) {
                count += 1;
                    
            } else {
                strB.append(myChar);
                strB.append(count);
                myChar = str.charAt(i);
                count = 1;
            }
        }

        strB.append(myChar);
        strB.append(count);


        System.out.println("The compressed string is " + strB.toString());
        System.out.println("The length of the compressed string is " + countCompression(str));
        System.out.println("The length if the compression from formula " + strB.length());
        System.out.println("The initial string length is " + str.length());





    } 

    public static int countCompression (String str) {

        if (str == null || str.isEmpty()) {
            return 0;
        }


        int length = str.length();
        int count = 1;
        char initial = str.charAt(0);
        int size = 0;


        for (int i = 1; i < length; i++) {
            if (initial ==  str.charAt(i)) {
                count += 1;
            } else {
                size +=  1 + String.valueOf(count).length();
                initial = str.charAt(i);
                count = 1;

            }

        }

        return size + 1+ String.valueOf(count).length() ;
    }
}



