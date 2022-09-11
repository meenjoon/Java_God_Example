package part15;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompare sample = new StringCompare();
//		sample.checkString();
		sample.checkCompare();
//		sample.checkCompareTo();
	}
	
	public void checkString() {
		String text = "Yout must know String class.";
		System.out.println("text.leng()="+text.length());
		System.out.println("text.isEmpty()=" + text.isEmpty());
	}
	public void checkCompare() {
		String text="Check value";
		String text2=new String("Check value");
		String text3 = "check value";
//		if(text==text2) {
//			System.out.println("text==text2 result is same.");
//		}else {
//			System.out.println("text==text2 result is different.");
//		}
//		if(text.equals("Check value")) {
//			System.out.println("text.equals(text2) result is same.");
//		}
//		if(text.equalsIgnoreCase(text3)) {
//			System.out.println("text.equalsIgnoreCase(text3) result is same.");
//		}
		if(text.equals(text2)) {
		System.out.println("text.equals(text2) result is same.");
	}
	}
	public void checkCompareTo() {
		String text="a";
		String text2="b";
		String text3="c";
		System.out.println(text2.compareTo(text));
		System.out.println(text2.compareTo(text3));
		System.out.println(text.compareTo(text3));
	}
	

}
