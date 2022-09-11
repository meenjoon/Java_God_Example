package part15;

import java.util.StringTokenizer;

public class StringSample {

	public static void main(String[] args) {
		StringSample sample = new StringSample();
//		sample.convert();
		sample.convertUTF16();

	}
	public void convert() {
		try {
			String korean="한글"; //1
			System.out.println(korean);
			byte[] array1=korean.getBytes(); //2
			for(byte data:array1) { //3
				System.out.print(data + " ");
			}
			System.out.println();
			String korean2 =new String(array1); //4
			System.out.println(korean2);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void printByteArray(byte[] array) {
		for(byte data:array) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	public void convertUTF16() {
		try {
			String korean ="한글";
			byte[] array1=korean.getBytes("UTF-16");
			printByteArray(array1);
			String korean2 =new String(array1, "UTF-16"); 
			System.out.println(korean2);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
