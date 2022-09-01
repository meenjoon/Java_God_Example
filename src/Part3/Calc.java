package Part3;

public class Calc {
	public static void main(String[] args) {
		
	
		System.out.println("Calculator class started");
		
		Calculator calc = new Calculator();
		
		int a = 10;
		int b = 20;
		calc.add(a, b);
		calc.substract(a, b);
		calc.multiply(a, b);
		calc.divide(a, b);
		
		System.out.println("add= " + calc.add(a, b) );
		System.out.println("substract= " + calc.substract(a, b) );
		System.out.println("multiply= " + calc.multiply(a, b) );
		System.out.println("divide= " + calc.divide(a, b) );

		
		
	}



}
