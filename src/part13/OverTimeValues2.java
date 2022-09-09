package part13;

public enum OverTimeValues2 {
	THREE_HOUR(18000),
	FIVE_HOUR(30000),
	WEEKEND_FOUR_HOUR(40000),
	WEEKEND_EIGHT_HOUR(60000);
	
	private final int amount;

	private OverTimeValues2(int amount) {
		this.amount = amount;
	}
	public int getAmount() {
		return amount;
	}


}