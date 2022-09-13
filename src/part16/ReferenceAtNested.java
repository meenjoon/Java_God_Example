package part16;

public class ReferenceAtNested {
	
	static class StaticNested{
		private int saticNestedInt=99;
		
	}
	
	class Inner {
		private int innerValue=100;
	}
	public void setValue(int value) {
		StaticNested nested = new StaticNested();
		nested.saticNestedInt = value;
		Inner inner = new Inner();
		inner.innerValue = value;

	}
}
