package part5;

public class OperatorIncrement {
	public static void main(String[] args) {
		OperatorIncrement exam = new OperatorIncrement();
		exam.increment();
		
	}
	
	public void increment() {
		int intValue =1;
		System.out.println(intValue++);
		System.out.println(intValue);
		System.out.println(++intValue);
	}

}
