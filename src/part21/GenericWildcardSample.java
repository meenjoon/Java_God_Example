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
	
	public <S,T extends Car> void multiGenericMethod(WildcardGeneric<S> c, S addValue, WildcardGeneric<T> e,T another) {
		c.setWildcard(addValue);
		S value = c.getWildcard();
		
		e.setWildcard(another);
		T value2 = e.getWildcard();
	}

	public <T extends Car> void boundedGenricMethod(WildcardGeneric<T> c, T addValue) {
		c.setWildcard(addValue);
		T value = c.getWildcard();
		System.out.println(value);
	}
	
	public void callGenricMethod_bounded() {
		WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
		boundedGenricMethod(wildcard, new Car("aaa"));
	}
	
	public void callGenricMethod_multi() {
		WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
		WildcardGeneric<Car> wildcard2 = new WildcardGeneric<Car>();
		multiGenericMethod(wildcard,"Data", wildcard2, new Car("aaa"));
	}

}
