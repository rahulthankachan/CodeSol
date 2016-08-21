import java.util.Scanner;

public class TestPad {

		public static void main(String[] args) {

			// Construct a program which will be equivalent to >> and << 
			int number = Integer.parseInt(args[1]);
			int x = Integer.parseInt(args[0]);
			//performLeftShift(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

			performRightShift(x, number);
			for (int i = 1; i <= number; i++) {
				System.out.println("For the index " + i + "  the value is " + (x>>i));
			}
		}


		public static void performLeftShift(int numberOuter, int n) {
			int number = numberOuter;
			for (int i = 1; i <=n; i++) {
				number = number * 2;
				if (i % 32 == 0) {
					number = numberOuter;
				}
				System.out.println("The output from the custom function is " + number);
			}
		}

		public static void performRightShift(int numberOuter, int n) {

			int number = numberOuter;
			for (int i = 1; i <=n; i ++) {
				if (number != -1) {
					number = number / 2;
				}
				if (i % 32 == 0) {
					number = numberOuter;
				} 


				System.out.println("The output from the custom function is " + number);

			}
		}
}
