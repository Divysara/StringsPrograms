import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {

		System.out.println("Enter a NO: ");
		Scanner sc = new Scanner(System.in);
		
		int givenNo = sc.nextInt();
		int count =0;
		
		for(int i=1;i<=givenNo;i++) {
			
			if(givenNo%i==0) {
				count++;
			}
		}
		if(count>2)
			System.out.println(givenNo +" not a prime no!");
		else
			System.out.println(givenNo +"  a prime no!");
		sc.close();
	}

}
