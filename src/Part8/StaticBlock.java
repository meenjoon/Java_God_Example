package Part8;

public class StaticBlock {
	static int data =1;
	
	public StaticBlock() {
		System.out.println("StaticBlccok Constructor.");
		data= 5;
	}
	static {
		System.out.println("****First static block****");
		data =3;
	}
	static {
		System.out.println("****Second static blcock****");
	}

	public static int getData() {
		return data;
		
	}
}
