package part8;

public class ReferenceReturn {
	public static void main(String[] args) {
		
		
	}
	public int intReturn() { //기본 자료형
		int returnInt=0;
		return returnInt;
	}
	
	public int[] intArrayReturn() { // 참조 자료형
		int returnArray[] = new int[10];
		return returnArray;
	}

}
