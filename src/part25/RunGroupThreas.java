package part25;

public class RunGroupThreas {

	public static void main(String[] args) {
		RunGroupThreas sample = new RunGroupThreas();
		sample.groupThread();

	}
	public void groupThread() {
		try {
			SleepThread sleep1 = new SleepThread(5000);
			SleepThread sleep2 = new SleepThread(5000);
			
			ThreadGroup group = new ThreadGroup("Group1");
			Thread thread1 = new Thread(group,sleep1);
			Thread thread2 = new Thread(group,sleep2);
			
			thread1.start();
			thread2.start();
			Thread.sleep(1000);
			System.out.println("Group name="+group.getName());
			int activeCount=group.activeCount();
			System.out.println("Active count="+activeCount);
			group.list();
			
			Thread[] tempThreadList = new Thread[activeCount];
			int result = group.enumerate(tempThreadList);
			System.out.println("Enumerate result="+result);
			for(Thread thread:tempThreadList) {
				System.out.println(thread);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
