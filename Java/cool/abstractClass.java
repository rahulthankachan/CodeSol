
import java.util.Scanner;

public class TestPad {

    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        TestPad test = new Child();
        System.out.println(test.sum(1,2));

        //Car c = new Car();
        Racecar rc = new Racecar();
        rc.right();
        rc.left();
        rc.shouldStart();

    }
}



class Child extends TestPad {

    @Override
    public int sum(int a, int b) {
        return a + b + 10;
    }



}



abstract class Car {

    public void right() {
        System.out.println("Turned Right");
    }

    abstract public void left();


}

class Racecar extends Car implements CarInterface, CarInterface2 {

    @Override
    public void left() {
        System.out.println("Turned Left");

    }

    @Override
    public boolean shouldStart() {
        System.out.println(this.x);
        return true;
    }

}



interface CarInterface {
    int x = 50;

    public boolean shouldStart();
}

interface CarInterface2 {
    int y = 51;

    public boolean shouldStart();
}
