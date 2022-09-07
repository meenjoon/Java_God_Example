package part8;

public class StaticBlcokCheck {
	public static void main(String[] args) {
		StaticBlcokCheck check = new StaticBlcokCheck();
		check.makeStaticBlockObject();
	
	}
	public void makeStaticBlockObject() {
		System.out.println("Creating block1");
		StaticBlock.data = 2;
		System.out.println("data = " + StaticBlock.data);
		StaticBlock blcok1 = new StaticBlock();
//		blcok1.data=2;
		System.out.println("data = " + StaticBlock.data);
		System.out.println("Created block1");
		System.out.println("---------------");
		System.out.println("Creating block2");
		StaticBlock blcok2 = new StaticBlock();
		System.out.println("Creating block2");
	}

}
