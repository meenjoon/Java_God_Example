package part21;

public class GenericWildcardSample {

	public static void main(String[] args) {
		GenericWildcardSample sample = new GenericWildcardSample();
		sample.callGenricMethod();

	}
	public <T> void genericMethod(WildcardGeneric<T> c, T addValue) {
		c.setWildcard(addValue);
		T value = c.getWildcard();
		System.out.println(value);
		
	}
	public void callGenricMethod() {
		WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
		genericMethod(wildcard, "Data");
	}

}
