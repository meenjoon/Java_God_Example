package Part7;

public class Arrayprint {
	public static void main(String[] args) {
		Arrayprint exam = new Arrayprint();
		exam.printPrimitiveArray();
		
	}
	public void printPrimitiveArray() {
		System.out.println("byteArray=" + new byte[1]);
		System.out.println("shortArray=" + new short[1]);
		System.out.println("intrray=" + new int[1]);
		System.out.println("longArray=" + new long[1]);
		System.out.println("floatArray=" + new float[1]);
		System.out.println("doubleArray=" + new double[1]);
		System.out.println("charArray=" + new char[1]);
		System.out.println("booleanArray=" + new boolean[1]);
		
	}

}
