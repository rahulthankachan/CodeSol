public class TestPad {

	public static void main(String[] args) {

		String myStr = new String("Hey there");
		String mySubStr = myStr.substring(0,3);

		System.out.println("The string is " + myStr);
		System.out.println("The character at the 3rd postion is " + myStr.charAt(2));

		System.out.println("The first occurance of character e is " + myStr.indexOf('e', 7));




	}

}
