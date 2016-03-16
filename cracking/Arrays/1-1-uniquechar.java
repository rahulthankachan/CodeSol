import java.util.Arrays;

class TestPad {
    public static void main(String[] args) {
        boolean[] myBool = new boolean[128];
        String str = args[0];
        int flag = 0;

        for (int i = 0; i < str.length(); i++) {
            int position = Integer.valueOf(str.charAt(i));
            System.out.println(position);
            if (myBool[position]) {
                System.out.println("NOT UNIQUE");
                flag =1;

                break;
            } else {
                myBool[position] = true;
            }
        }

        if (flag == 0) {
            System.out.println("UNIQUE");
        }

}

}


/*

    If the string has all the unique characters. Given we are not allowed to use any of the extra data structures

1. for loop 2 times to check(This is a wrong approach)
2. Also we dont have access to the set data structure


*/
