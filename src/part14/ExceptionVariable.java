package part14;

public class ExceptionVariable {

	public static void main(String[] args) {
		ExceptionVariable sample = new ExceptionVariable();
		sample.checkVariable();

	}
	public void checkVariable() {
		int[] intArray = new int[5];
		
		try {

			System.out.println(intArray[5]);
		}
		catch (Exception e) {
			System.out.println(intArray.length);
		}
		System.out.println("This code must run.");
	}
	

}
