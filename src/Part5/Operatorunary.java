package Part5;

public class Operatorunary {
	public static void main(String[] args) {
		Operatorunary exam = new Operatorunary();
		
		exam.unary();
		
	}
	
	public void unary() {
		int intValue = -10;
		int result = +intValue;
		System.out.println(result);
		result = -intValue;
		System.out.println(result);
		
	}

}
