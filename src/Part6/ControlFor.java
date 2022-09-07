package part6;

public class ControlFor {
	public static void main(String[] args) {
		ControlFor exam = new ControlFor();
		exam.forLoop(10);
		
	}
	public void forLoop(int until) {
		int sum =0;
		
		for(int loop=1; loop<=until; loop++) {
			sum +=loop; // sum = sum + loop 이 코드와 같다.
		}
		System.out.println("1 to " + until + "= " + sum );
	}

}
