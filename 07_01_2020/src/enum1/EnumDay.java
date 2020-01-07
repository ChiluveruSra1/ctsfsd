package enum1;

public class EnumDay {
	
	private DAY day;

	public EnumDay(DAY day) {
		super();
		this.day = day;
	}

	public DAY getDay() {
		return day;
	}
	
	public static void main(String[] args) {
		EnumDay ed=new EnumDay(DAY.FRIDAY);
		System.out.println(ed.getDay().getDay1()+"- "+ed.getDay().getNo());
	}
}