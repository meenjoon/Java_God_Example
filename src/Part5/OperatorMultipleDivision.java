package part5;

public class OperatorMultipleDivision {
	public static void main(String[] args) {

		OperatorMultipleDivision exam = new OperatorMultipleDivision();
		
		exam.divideInt();
		exam.divideInt2();
		exam.compound();
		
	}
	
	public void divideInt() {
		int intValue1 = 5;
		int intValue2 = 10;
		int result = intValue1/intValue2;
		System.out.println(result);

	}
	
	public void divideInt2() {
		double intValue1 = 5;
		double intValue2 = 10;
		double result = intValue1/intValue2;
		System.out.println(result);

	}
	
	public void compound() {
		int intvalue = 10;
		int result = intvalue + 5;
		System.out.println(result);
		result = result - 5;
		System.out.println(result);
		result = result * 5;
		System.out.println(result);
		result = result / 5;
		System.out.println(result);
		result = result % 5;
		System.out.println(result);
		
	}

}
