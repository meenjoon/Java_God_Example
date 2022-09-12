package part16;

public class OuterOfStatic {
	static class StaticNeted{
		private int value=0; //1
		public int getValue() { //2
			return value;
		}
		public void setValue(int value) {
			this.value=value;
		}
	}

}
