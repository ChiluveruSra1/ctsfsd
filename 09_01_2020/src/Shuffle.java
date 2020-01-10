import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Shuffle {

	
	public static void main(String[] args) {
		int arr[]= {1,-100,90,11,34,30,9,0,6,5};
			
		//List<int[]> l = Arrays.asList(arr);
		int index=Arrays.binarySearch(arr, -100);
		
		System.out.println(index);
		//int index=Collections.binarySearch(l, 78);
		/*
		 * System.out.println(index); if(index>=0) {
		 * System.out.println("found "+l.get(index)+" at :"+index); } else {
		 * System.out.println("not found "+index); }
		 */
		/*
		 * int index=Collections.binarySearch(l, -1); System.out.println(index);
		 */
	}

}
