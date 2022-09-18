package part7;

import java.util.Set;

public class ArrayNewFor {
	public static void main(String[] args) {
		ArrayNewFor exam = new ArrayNewFor();
//		exam.newFor();
//		exam.twoDimFor();
		exam.twoDimForWithCounter();
	}
	public void newFor() {
		int [] oneDim=new int[] {1,2,3,4,5,6,7,8,9,10};
		for(int data:oneDim) {
			System.out.println(data);
		}
	}
	public void twoDimFor() {
		int[][]twoDim= {{1,2,3},{4,5,6}};
		for(int[] dimArray : twoDim) { //twoDim의 1차원 값은 배열이기 때문에 그냥 int dimArray가 아니라int[] dimArray로 지정해
			for(int data : dimArray) { //dimArray의 1차원 값은 int이기 때문에 int data라고 썼다.
				System.out.println(data);
			}
		}
	}
	public void twoDimForWithCounter() {
		int[][]twoDim = {{1,2,3,},{4,5,6}};
		int oneCounter=0;
		for(int[] dimArray : twoDim) {
			int twoCounter=0;
			for(int data : dimArray){
				System.out.println(data +" "+ oneCounter +" "+ twoCounter);
				twoCounter++;
			}
			oneCounter++;
		}
		
	}


}
