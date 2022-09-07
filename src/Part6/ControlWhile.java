package part6;

public class ControlWhile {
	public static void main(String[] args) {
		
		ControlWhile exam = new ControlWhile();
		exam.whileLoope();
//		exam.whileContinueInfinit();
	}
	
	public void whileLoope() {
		int loop = 0;
		
		while (loop< 12) {
			loop++;
			
			ControlOfFlow exam = new ControlOfFlow();
			exam.switchCalender(loop);
			
		}
	}
	
	public void whileContinueInfinit() {
		int loop = 0;
		
		while (loop< 12) {

			if(loop==6) continue;//증가 값이 없으므로 6에 계속 무한 루프를 시전한다.
			loop++;
			
			
			ControlOfFlow exam = new ControlOfFlow();
			exam.switchCalender(loop);
			
		}
	}

}
