package part16;

public class NestedSample {

	public static void main(String[] args) {
		NestedSample sample = new NestedSample();
		sample.makeStaticNestedObject();

	}
	public void makeStaticNestedObject() {
		OuterOfStatic.StaticNeted staticNested = new OuterOfStatic.StaticNeted();
		staticNested.setValue(3);
		System.out.println(staticNested.getValue());
	}

}
