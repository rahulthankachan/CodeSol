import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;


public class TestPad {

	public static void main(String[] args) {

		TestPad test = new TestPad();
		Ball b = new Ball();
		Basketball bb = new Basketball();
		Ball b1 = new Basketball();

		System.out.println("The radius of b is " + bb.radius);
		System.out.println("The radius from the scope of Ball for a Basketball is " + b1.radius);

		test.play(b);
		test.play(bb);

	}

	public void play(Ball aBall) {
		System.out.println("The radius of the ball is " + aBall.radius);
		aBall.bounce();
	}


}


class Ball {

	int radius = 2;

	public void bounce() {
		System.out.println("The ball can bounce to height of 2 m");
	}

}


class Basketball extends Ball {
	int radius = 23;
	@Override
	public void bounce() {

		System.out.println("The basketball can bounce for 1m only");
	}
}
