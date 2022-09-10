package part14;

public class ThrowableSample {

	public ThrowableSample() {
		
	}

	public static void main(String[] args) {
		int[] intArray=new int[5];
		try {
//			intArray=null;
			System.out.println(intArray[5]);
		}
		catch (Throwable t) {
//			System.out.println(t.toString());
			t.printStackTrace();
		}

	}

}
