

public class TestPad {
    public static void main(String[] args) {

        TestPad test = new TestPad();
        int length = Integer.parseInt(args[1]);
        String str = args[0];
        char[] strC = str.toCharArray();

        int spaces = 0;
        for (int i = 0; i < length; i++) {
            if (strC[i] == ' ') {
                spaces += 1;
            }
        }

        int lengthreq = length + 2 * spaces;

        for (int i = length - 1; i > 0; i --) {
            if (strC[i] ==  ' ') {
                strC[lengthreq - 1] = '0';
                strC[lengthreq - 2] = '2';
                strC[lengthreq - 3] = '%';
                lengthreq -= 3; 
                length -= 1;

            } else {
                strC[lengthreq - 1] = strC[length - 1];
                lengthreq -= 1;
                length -= 1;
            }
        }

        System.out.println(new String(strC));


    }
}


/*

1. We need to know the initial length
2. Calculate the initial spaces
3. required = initial + 2*(spaces)
4. Move the pointers


*/



