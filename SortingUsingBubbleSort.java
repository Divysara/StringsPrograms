import java.util.Arrays;

public class SortingUsingBubbleSort {

	public static void main(String[] args) {

		//sorting using bubble sort method:
		
		int no[]= {55,22,11,45,60};
		
		int temp;
		
		for(int i=0;i<no.length-1;i++) 
		{
			for(int j=0;j<no.length-1;j++) 
			{
				if(no[j]>no[j+1]) {
					temp=no[j];
					no[j]=no[j+1];
					no[j+1]=temp;
				}
			}
		}
		System.out.println("after sorting :" + Arrays.toString(no));
		
	}

}
