public class TestPad{

	public static void main(String[] args){

		System.out.println("Hey there");

		double length = Double.parseDouble(args[0]);
		TestPad check = new TestPad();
		double result = check.convertor(length);

		System.out.println("The value of the converted value is " + result);
		System.out.println("The value  of the number is 3");
		System.out.println("The value of the two\' complement is "+ twos_complement(3));
		System.out.println("The value of one's complement is " + ones_complement(3));


		
	}

	public  double convertor(double value){
		return 3.12 * value;
	}

	public static int twos_complement(int x){

		return -x;
	}

	public static int ones_complement(int x){

		return ~x;
	}



}

