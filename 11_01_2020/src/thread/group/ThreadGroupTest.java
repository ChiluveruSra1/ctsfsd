package thread.group;

public class ThreadGroupTest {
	public static void main(String[] args) {

		System.out.print("number of active threads: ");
		System.out.print(Thread.currentThread().getThreadGroup().activeCount() + "  "+Thread.currentThread()+"\n\n");

		Thread t1 = new SimpleThread1("Boston");
		t1.start();

		System.out.print("number of active threads: ");
		System.out.print(Thread.currentThread().getThreadGroup().activeCount() + "\n");

		Thread t2 = new SimpleThread1("New York");
		t2.start();

		System.out.print("number of active threads: ");
		System.out.print(Thread.currentThread().getThreadGroup().activeCount() + "\n");

		Thread t3 = new SimpleThread1("Telangana");
		t3.start();

		System.out.print("number of active threads: ");
		System.out.print(Thread.currentThread().getThreadGroup().activeCount() + "\n");
		// System.out.println(Thread.currentThread().getThreadGroup());

		/*
		 * SimpleThread1 s1 = new SimpleThread1("Boston"); SimpleThread1 s2 = new
		 * SimpleThread1("Boston"); SimpleThread1 s3 = new SimpleThread1("Boston");
		 * Thread t1= new Thread(s1); Thread t2= new Thread(s2); Thread t3= new
		 * Thread(s3); t1.start(); t2.start(); t3.start();
		 */
	}
}
