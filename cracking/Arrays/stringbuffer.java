import java.util.Arrays;

class TestPad {
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer();
        s.append("Rahul");
        s.append("is");
        s.append("my");

        System.out.println("The final String is " + s.toString());


    }
}



class StringBuffer {

    int CAPACITY = 16;
    char[] values;
    int count = 0;

    public StringBuffer() {
        values = new char[CAPACITY];
    }

    public void append(String s) {
        ensureCapacity(s.length());
        int length = s.length();
        for (int i = 0; i < length; i++) {
            values[count] = s.charAt(i);
            count += 1;
        }
        count += 1;

    }

    public String toString() {
       char[] strFinal = Arrays.copyOfRange(values, 0, count);
        return new String(strFinal);

    }

    public void ensureCapacity(int length) {
        if (count + length  >= CAPACITY) {
            CAPACITY = CAPACITY * 2 + length;
            values = Arrays.copyOf(values, CAPACITY);
        }

    }

}
