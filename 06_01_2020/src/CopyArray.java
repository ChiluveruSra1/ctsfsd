
public class CopyArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int a1[]= {10,9,8,7,6,5,4,3,2,1};
		System.arraycopy(a, 0, a1, 2, 4);
		for (int i:a1) {
		System.out.print(i+" ");
		}
	}

}
