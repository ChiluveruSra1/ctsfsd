package thread;


public class ThreadDemo1 implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=20;i++)
			System.out.print(i+ " ");
		
	}

	public static void main(String[] args) throws Exception {
		ThreadDemo1 td1=new ThreadDemo1();
		
		Thread t1=new Thread(td1);
		Thread t2=new Thread(td1);

		System.out.println(t1.getState());

		t1.start();
		System.out.println(t1.isAlive());

		System.out.println(t1.isInterrupted());
		t2.start();

		System.out.println(t1.isInterrupted());
		System.out.println(t1.isAlive());

	}
}
