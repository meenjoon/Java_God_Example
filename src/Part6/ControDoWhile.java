package Part6;

public class ControDoWhile {
	public static void main(String[] args) {
		ControDoWhile exam = new ControDoWhile();
		exam.doWhile();
	}
	public void doWhile() {
	
		ControlOfFlow exam = new ControlOfFlow();
		int loop=0;
		do {
			loop++;
			exam.switchCalender(loop);
		} while(loop<12);
}
}
