package part10;

public class ParentArg {
//	public ParentArg(String name) {
//		System.out.println("ParentArt("+name+") Constructor");
//	}
	public ParentArg(InheritancePrint object) {
		System.out.println("ParentArg(InheritancePrint) Constructor");
		
	}

	public void printName() {
		System.out.println("printName() - ParentArg" );
	}
}
