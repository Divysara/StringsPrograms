import java.util.Arrays;

public class SearchAnElementUsingBinarySearch {

	public static void main(String[] args) {

		int arr[]= {22,33,66,77,88}; // to use binary search method the array must be in sorted.
		
		int l=0;
		int h=arr.length-1;
		int key = 88;
		boolean flag=false;
		
		while(l<=h) 
		{
			int m = (l+h)/2;
			
			if(key==arr[m])
			{
				System.out.println(key +" - Element Found!");
				flag = true;
				break;
			}
			if(key>arr[m]) {
				l=m+1;
			}
			if(key<arr[m]) {
				h=m-1;
			}
		}
		if(flag==false) {
			System.out.println(key +" - Element not found");
		}
		
		System.out.println(Arrays.binarySearch(arr, key));// this returns the index value of the key found in the array.
		
	}

}
