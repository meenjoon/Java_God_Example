package Part6;

public class CotrolLabel {
	public static void main(String[] args) {
		CotrolLabel exam = new CotrolLabel();
		exam.printTimesTable();
	}
	public void printTimesTable() {
		startLabel:
		for(int level=2 ; level<10; level++) {
			
			for(int unit=1; unit<10; unit++ ) {
				if(unit==4) continue ;
				System.out.print(level + "*" + unit + "="+level*unit+ " ");
			}
			System.out.println();
		}
	}

}
