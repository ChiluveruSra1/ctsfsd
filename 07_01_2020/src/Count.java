public class Count {
	private static Integer count = 0;
	private String temp;

	private final int MAX;

	public Count() {
		super();
		MAX = 10;
	}

	public Count(String temp) {
		super();
		MAX = 18;
		count++;
		this.temp = temp;
	}

	@Override
	public String toString() {
		return count + temp;
	}

	public int display() {
		System.out.println(MAX);
		return count;
	}

	public static void main(String[] args) {
		Count c = new Count();
		System.out.println(c.toString());
		System.out.println(c.display());
	}
}