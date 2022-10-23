import java.util.Scanner;

public class ReverseNumber {


	public static void ReverseNo() {
		
		int reverse=0;
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		System.out.println("The given no: " + no);
		int number =no;


		while(number!=0) {
			reverse=reverse*10+(number%10);
			number = number/10;
		}
		System.out.println("The reversed no is :"+reverse);
		if(no==reverse) 
			System.out.println("The given no is a palindrome!");
		sc.close();
		
	}
	public static void stringBufferMethod() {
		int no = 121;

		StringBuffer sb = new StringBuffer(String.valueOf(no));
		StringBuffer reverse;
		reverse=sb.reverse();
		System.out.println(reverse);
		String str  = reverse.toString();
		int numb = Integer.parseInt(str);
		if(numb==no)
			System.out.println("palindrome!");

	}
	public static void stringBuilderMethod() {
		int no = 1234;

		StringBuilder sb = new StringBuilder();
		sb.append(no);
		StringBuilder reverse=sb.reverse();
		System.out.println(reverse);
		
		

	}

	public static void main(String[] args) {
		stringBufferMethod();
		//ReverseNo();
		//stringBuilderMethod();
	}

}
