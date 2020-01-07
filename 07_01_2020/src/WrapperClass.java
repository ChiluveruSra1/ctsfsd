

public class WrapperClass {
	private Integer wInt;
	private int pInt;
	public WrapperClass(Integer wInt, int pInt) {
		super();
		this.wInt = wInt;
		this.pInt = pInt;
	}
	@Override
	public String toString() {
		return "\nBoxingUnboxingDemo [wInt=" + wInt + ", pInt=" + pInt + "]";
	}
	
	public void display()
	{
		int tempP=wInt;//auto unboxing
		Integer tempW=pInt;//auto boxing
		System.out.println(this);
		System.out.printf("After Auto Boxing/unboxing: %d %d ",wInt,pInt);
	}
	
	public static void main(String[] args) {
		WrapperClass wc=new WrapperClass(100, 200);
		wc.display();
		System.out.println(wc.toString());
	}
	
}