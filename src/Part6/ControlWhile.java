package Part6;

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

			if(loop==6) continue;//���� ���� �����Ƿ� 6�� ��� ���� ������ �����Ѵ�.
			loop++;
			
			
			ControlOfFlow exam = new ControlOfFlow();
			exam.switchCalender(loop);
			
		}
	}

}
