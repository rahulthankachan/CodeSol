public class TestPad{

	public static void main(String[] args){

		System.out.println("Hey there");

		double length = Double.parseDouble(args[0]);
		TestPad check = new TestPad();
		double result = check.convertor(length);

		System.out.println("The value of the converted value is " + result);


		
	}

	public  double convertor(double value){
		return 3.12 * value;
	}



}

