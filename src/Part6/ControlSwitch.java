package Part6;

public class ControlSwitch {
	public static void main(String[] args) {
		ControlSwitch exam = new ControlSwitch();
		exam.switchStatement(1);
		exam.switchStatement(2);
		exam.switchStatement(3);
		exam.switchStatement(4);
		exam.switchStatement(5);
		exam.switchStatement(6);
		
	}
	
	public void switchStatement(int nuberOfWheel) {
		switch (nuberOfWheel) {
		case 1:
			System.out.println(nuberOfWheel+":It is one foot bicycle.");
			break;
		case 2:
			System.out.println(nuberOfWheel+":It is motor cycle or bicycle.");
			break;
		case 3:
			System.out.println(nuberOfWheel+":It is a three wheel car.");
			break;
		case 4:
			System.out.println(nuberOfWheel+":It is a car.");
			break;
		default:
			System.out.println(nuberOfWheel+":It is an expensive car.");
			break;
			
		}
	}

}
