package Part5;

public class OperatorConditionalTriple {

	public static void main(String[] args) {
		OperatorConditionalTriple exam = new OperatorConditionalTriple();
		exam.doBlindDate(80);
		
	}
	
	public boolean doBlindDate(int point) {
		boolean doBlindDateFlag = false;
		doBlindDateFlag = (point>= 80) ? true : false; //이 부분에서 삼항연산자(:)를 사용하였고 맞으면 true 거짓이면 false를 출력한다.
		System.out.println(point + " : " + doBlindDateFlag);
		return doBlindDateFlag;
	}


}

