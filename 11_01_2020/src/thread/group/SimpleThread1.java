package thread.group;

//public class SimpleThread1 implements Runnable{

public class SimpleThread1 extends Thread {
	/*
	 * private String str;
	 */ 
	  public SimpleThread1(String str) { super(str);  }
	 
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {

			System.out.println(i+"  "+getName());

			try {
				//wait((long) (Math.random() * 1000)); 
				sleep((long)(Math.random()*1000));
				//System.out.print(" "+getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		 System.out.println("\n\n"+getName()+"\n");
	}
}
