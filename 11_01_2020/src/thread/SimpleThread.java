package thread;

public class SimpleThread extends Thread {			//main in threadpriority class
	public SimpleThread(String str) {
		super(str);
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.println(i);
		System.out.println(getName()+" "+getPriority());
	}
}