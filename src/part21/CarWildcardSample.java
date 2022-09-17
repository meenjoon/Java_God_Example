package part21;

public class CarWildcardSample {

	public static void main(String[] args) {
		CarWildcardSample sample = new CarWildcardSample();
		sample.callBoundeWildcardMethod();

	}
	public void callBoundeWildcardMethod() {
		WildcardGeneric<Bus> wildcard = new WildcardGeneric<Bus>();
		wildcard.setWildcard(new Bus("Mustang"));
		boundedWildcardMethod(wildcard);
		
	}
	public void boundedWildcardMethod(WildcardGeneric<? extends Car> c ) {
		Car value = c.getWildcard();
		System.out.println(value);
	}

}
