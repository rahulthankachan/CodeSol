public class High implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("I am so high!");
		}
		
	}
}
