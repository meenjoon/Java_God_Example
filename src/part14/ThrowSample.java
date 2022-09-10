package part14;

public class ThrowSample {

	public static void main(String[] args) throws Exception {
		ThrowSample sample = new ThrowSample();
		sample.throwException(13);

	}
	
	public void throwException(int number) throws Exception {
		if(number >12 ) {
			throw new Exception("Number is over than 12");
		}
		System.out.println("Number is " + number);
		
	}

}
