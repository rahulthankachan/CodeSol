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
		
		if (animal instanceof Tiger) {
			((Tiger)animal).climbs();
		}

		animal.roar();
	}


}


class Cat {

	public void roar() {
		System.out.println("Meowwww");
	}

	public void eat() {


	}

	public void dance() {


	}

}


class Tiger extends Cat {

	@Override

	public void roar() {

		System.out.println("Grrrrrr");
	}

	public void climbs() {

		System.out.println("The Tiger just climbed the tree");
	}
}

class Lion extends Cat {


	@Override 

	public void roar() {

		System.out.println("ROARRRRRRRRRR");
	}

	public void sleep() {

		System.out.println("The lion is sleeping now");
	}
}
