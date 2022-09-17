package part21;

public class WildcardSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildcardSample sample = new WildcardSample();
		sample.callWildcardMetod();

	}
	public void callWildcardMetod() {
		WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
		wildcard.setWildcard("A");
		wildcardStringMethod(wildcard);
		
	}
	public void wildcardStringMethod(WildcardGeneric<?> c) {

		Object value = c.getWildcard();
		if(value instanceof String) {
			System.out.println(value);
		}
		
	}

}
