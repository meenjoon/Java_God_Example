package part14;

public class ExceptionSample {

	public static void main(String[] args) {

		ExceptionSample sample = new ExceptionSample();
		sample.arrayOutOfBounds();

	}
	public void arrayOutOfBounds() {
		int[] intArray = new int[5];
		
		try {

			System.out.println(intArray[5]);
		}
		catch (Exception e) {
			System.err.println("Exception occured.");
		}
		System.out.println("This code must run.");
	}
}
