package circus.losangeles;


public class Circus {

	public static void main(String[] args) {

		System.out.println("Welcome to the Los Angeles Circus");
		Trainer rahul = new Trainer();

		Cat c1 = new Cat();
		Lion l1 = new Lion();
		Tiger t1 = new Tiger();


		rahul.train(c1);
		rahul.train(l1);
		rahul.train(t1);


	}
}


class Trainer {

	public void train(Cat aCat) {

		aCat.eat();
		if (aCat instanceof Lion) {
			((Lion)aCat).sleeping();
		}

		if (aCat instanceof Tiger) {
			((Tiger)aCat).swim();
		}

	}
}

class Cat {

	public void eat() {
		System.out.println("The cat is now eating");
	}
}
