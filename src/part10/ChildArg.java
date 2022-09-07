package part10;

public class ChildArg extends ParentArg{
	static InheritancePrint exam = new InheritancePrint();
	

	public ChildArg() {
//		super("ChildArg");
		
		super(exam);
		System.out.println("Child Constructor");
	}
}
