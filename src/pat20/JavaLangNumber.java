package pat20;

public class JavaLangNumber {

	public static void main(String[] args) {
		JavaLangNumber sample = new JavaLangNumber();
//		sample.nuberTypeCheck();
		sample.integerMinMaxCheckBinary();

	}
	public void nuberTypeCheck() {
		String value1="3";
		String value2="5";
		byte byte1=Byte.parseByte(value1); //1
		byte byte2=Byte.parseByte(value2); //1
		System.out.println(byte1 + byte2); //2
		
		Integer refInt1= Integer.valueOf(value1); //3
		Integer refInt2= Integer.valueOf(value2); //3
		System.out.println(refInt1+refInt2+"7"); //4
	}
	public void integerMinMaxCheckBinary() {
		System.out.println("Inter BINARY min ="+Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println("Inter BINARY max ="+Integer.toBinaryString(Integer.MAX_VALUE));
	
		System.out.println("Integer HEX min ="+Integer.toHexString(Integer.MIN_VALUE));
		System.out.println("Integer HEX max ="+Integer.toHexString(Integer.MAX_VALUE));
	}
	
	
}
