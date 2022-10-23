
public class Factorial {

	public static void main(String[] args) {

		int no=5;
		int factorial =1;
		for( int i=1 ;i<=no;i++)
		{
			factorial=factorial*i;	
		}
		System.out.println("Factorial of the number "+ no+" is: "+ factorial);

		int no1=5;
		int factorial1=1;
		for(int i=no1;i>=1;i--)
		{
			factorial1=factorial1*i;
		}
		System.out.println("Factorial of the number "+ no1+" is: "+ factorial1);
		
		int arr[]= {1,2,3,4,5,6};
		int sum=0;
		for(int j=0;j<arr.length;j++)
		{
			sum=sum+arr[j];
		}
		System.out.println("The sum of the elements in an array: "+ sum);
		
	}

}
