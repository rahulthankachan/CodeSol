public class TestPad {

	public static void main(String[] args) {

		Cat c1 = new Cat();
		Lion l1 = new Lion();
		Cat cl = new Lion();

		System.out.println("Incase of the variables");
		System.out.println(c1.ownerID);
		System.out.println(l1.ownerID);
		System.out.println(cl.ownerID);

		System.out.println("Incase of the Functions");
		c1.getType();
		l1.getType();
		cl.getType();

	}
}



class Cat {

	public int ownerID = 123;

	public void getType() {
		System.out.println("I am a Cat type");
	}

}

class Lion extends Cat {

	public int ownerID = 12345;

	@Override
	public void getType() {

		System.out.println("I am lion type");
	}


}
