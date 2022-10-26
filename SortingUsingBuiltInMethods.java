import java.util.Arrays;
import java.util.Collections;

public class SortingUsingBuiltInMethods {

	public static void main(String[] args) {

		//Approach 1:
		int a []= {10,100,30,80,40,90};
		System.out.println("Before sorting: "+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting: "+ Arrays.toString(a));
		
		//Approach 2:
		int b []= {10,100,30,80,40,90};
		System.out.println("Before sorting: "+ Arrays.toString(b));
		Arrays.parallelSort(b);
		System.out.println("After sorting: "+ Arrays.toString(b));
		
		
		//Approach 3: Reverse sort
		Integer c[]= {20,10,4,2,90,56};
		System.out.println("Before sorting: "+ Arrays.toString(c));
		Arrays.sort(c,Collections.reverseOrder());// this will work only for Integer types not for int.
		System.out.println("After sorting: "+ Arrays.toString(c));

		

	}

}
