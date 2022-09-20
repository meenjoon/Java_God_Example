package part25;

public class CommonCalculate {

	

	
	public CommonCalculate() {
		amount=0;
	}
	private int amount;
	Object lock = new Object();
	public void plus(int value) {
		synchronized (lock) {
			amount += value;
		}
		
	}
	public void minus(int value) {
		synchronized (lock) {
			amount -= value;
		}
	}
	public int getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}
}
