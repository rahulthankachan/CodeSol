package inheritance;

public class C extends B {

	public void methodC() {

		System.out.println("We are in C currently");

	}

	public static void main(String[] args) {

		A myC = new C();
		//myC.methodC();
		//myC.methodB();
		myC.methodA();

	}
}
