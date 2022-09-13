package part7;

public class ArrayLength {
	public static void main(String[] args) {
		ArrayLength exam = new ArrayLength();
		exam.printArrayLength();
//		exam.printArray();
	}
	public void printArrayLength() {
		int [] oneDim=new int[3];
		int [][] twoDim= new int[4][2];
		System.out.println(oneDim.length);
		System.out.println(twoDim.length);
		System.out.println(twoDim[0].length);
		System.out.println(twoDim[1].length);
	}
	public void printArray() {
		int [][]twoDim= {{1,2,3,},{4,5,6}};
		
		System.out.println("twoDim.length="+twoDim.length);
		System.out.println("twoDim[0].length="+twoDim[0].length);
		System.out.println("twoDim[1].length="+twoDim[1].length);
//		System.out.println("twoDim[2].length="+twoDim[2].length);
//		for(int oneLoop=0; oneLoop<2; oneLoop++) {
//			for(int twoLoop=0; twoLoop<3; twoLoop++) {
//				System.out.println("twoDim["+oneLoop+"]["+twoLoop+"]="
//						+twoDim[oneLoop][twoLoop]);
//			}
//		}
		
//		for(int oneLoop=0; oneLoop<twoDim.length; oneLoop++) {
//			for(int twoLoop=0; twoLoop<twoDim[oneLoop].length; twoLoop++) {
//				System.out.println("twoDim["+oneLoop+"]["+twoLoop+"]="
//						+twoDim[oneLoop][twoLoop]);
//			}
//		
//		}
		int twoDimlength=twoDim.length;
		for(int oneLoop=0; oneLoop<twoDimlength; oneLoop++) {
			int twoOneDimlength= twoDim[oneLoop].length;
			for(int twoLoop=0; twoLoop<twoOneDimlength; twoLoop++) {
				System.out.println("twoDim["+oneLoop+"]["+twoLoop+"]="
						+twoDim[oneLoop][twoLoop]);
			}
		
		}
	}

}
