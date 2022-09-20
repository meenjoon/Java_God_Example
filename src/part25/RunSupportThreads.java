package part25;

public class RunSupportThreads {

	public static void main(String[] args) {
		RunSupportThreads sample = new RunSupportThreads();
//		sample.checkThreadState1();
		sample.checkJoin();

	}
	public void checkThreadState1() {
		SleepThread thread = new SleepThread(2000); //1
		try {
			System.out.println("thread state="+thread.getState()); //2
			thread.start();
			System.out.println("thread state(after start)="+thread.getState());
		
			Thread.sleep(1000); //3
			System.out.println("thread state(after 1 sec)="+thread.getState());
		
			thread.join(); //4
			thread.interrupt(); //5
			System.out.println("thread state(after join)="+thread.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void checkJoin() {
		SleepThread thread = new SleepThread(2000);
		try {
			thread.start();
			thread.join(2016);
			thread.interrupt();
			System.out.println("thread state(after join)="+thread.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
