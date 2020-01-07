package enum1;

public enum DAY {
	SUNDAY("Today is Holiday",1),
	MONDAY("Today is Monday",2),
	TUESDAY("Today is Tuesday",3),
	WEDNESDAY("Today is Wednesday",4),
	THURSDAY("Today is Thursday",5),
	FRIDAY("Today is Friday",6),
	SATDAY("Today is Holiday",7);
	private final String day1;
	private final int no;

	private DAY(String string, int i) {
		day1 = string;
		no = i;
	}

	public String getDay1() {
		return day1;
	}

	public int getNo() {
		return no;
	}

	
}
