package part5;

public class OperatorConditionalTriple {

	public static void main(String[] args) {
		OperatorConditionalTriple exam = new OperatorConditionalTriple();
		exam.doBlindDate(80);
		
	}
	
	public boolean doBlindDate(int point) {
		boolean doBlindDateFlag = false;
		doBlindDateFlag = (point>= 80) ? true : false; //�� �κп��� ���׿�����(:)�� ����Ͽ��� ������ true �����̸� false�� ����Ѵ�.
		System.out.println(point + " : " + doBlindDateFlag);
		return doBlindDateFlag;
	}


}

