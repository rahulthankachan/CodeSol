public class TestPad {

	public static void main(String[] args) {

		TestPad test = new TestPad();
		Cat myCat = new Cat();
		Lion myLion = new Lion();
		Tiger myTiger = new Tiger();

		test.testPolymorphism(myLion);
		test.testPolymorphism(myCat);
		test.testPolymorphism(myTiger);



	}

	public void testPolymorphism(Cat animal) {
		animal.roar();
	}


}


class Cat {

	public void roar() {
		System.out.println("Meowwww");
	}

}


class Tiger extends Cat {

	@Override

	public void roar() {

		System.out.println("Grrrrrr");
	}
}

class Lion extends Cat {


	@Override 

	public void roar() {

		System.out.println("ROARRRRRRRRRR");
	}
}
