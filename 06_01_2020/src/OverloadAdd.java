public class OverloadAdd {			//varargs(variable arguments
	public int result = 0;
	public int add(int... a) {
		for (int i : a)
			result += i;
		return result;
	}

	public String add(String s, int a, int b) {
		return s + (a + b);
	}

	public static void main(String[] args) {
		OverloadAdd oa = new OverloadAdd();
		System.out.println(oa.add(443, 445, 45, 32, -1000, 35));
		System.out.println(oa.add("Sra", 2, -1));
	}
}