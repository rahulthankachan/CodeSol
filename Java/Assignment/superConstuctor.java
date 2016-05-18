// import java.util.List;
// import java.util.ArrayList;
// import java.util.Collections;


public class TestPad {
    public static void main(String[] args) {

        X myClass = new X();
        System.out.println("Hey there");

    }

    public void display() {
        System.out.println("Hey There");
    }

    public TestPad() {
        System.out.println("This is the base constructor");
    }

    public TestPad(String x) {
        System.out.println("This is the second controller");
    }
}


class X extends TestPad {

    public X() {
        //super("Hey");
        System.out.println("This is the child constructor");
    }


}


