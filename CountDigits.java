
public class CountDigits {
	
	public static void sum() {
		
		int j =234;
		int temp = 0;
		while(j>0) {	
		 temp= temp+j%10;
		 j=j/10;
		}
		 System.out.println("sum of digits : " +temp);
	}
	

	public static void main(String[] args) {

	int digit = 1345,count=0;
	
	while(digit!=0) {
		digit=digit/10;
		count++;
	}
		System.out.println("No of Digits present in the given NO: "+count);
		sum();
		
	}

}
