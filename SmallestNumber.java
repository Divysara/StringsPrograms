import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumber {

	public static void smallest() {
		int givenarray[]= {500,20,8,11,3,67};
		int min=givenarray[0];
		for(int i =1;i<givenarray.length;i++) {
			if(givenarray[i]<min) 
				min=givenarray[i];
		}
		System.out.println(min);
	}
	public static void largest() {
		int givenarray[]= {500,20,8,11,3,67};
		int max=givenarray[0];
		for(int i =1;i<givenarray.length;i++) {
			if(givenarray[i]>max) 
				max=givenarray[i];
		}
		System.out.println(max);
	}
	public static void UsingArrays() {
		int givenarray[]= {5,20,8,11,3,67};
		Arrays.sort(givenarray);
		System.out.println(givenarray[0]);
	}

	public static void UsingCollections() {
		Integer givenarray[]= {5,20,8,11,3,67};
		Arrays.asList(givenarray);
		List<Integer> li = Arrays.asList(givenarray);
		Collections.sort(li);
		int smallest = li.get(0);
		System.out.println(smallest);
	}
	public static void main(String[] args) {

		smallest();
		largest();
		UsingArrays();
		UsingCollections();
	}

}
