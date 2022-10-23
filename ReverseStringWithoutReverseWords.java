import java.util.Scanner;

public class ReverseStringWithoutReverseWords {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String  string =  sc.nextLine();
		System.out.println("The original string : "+ string);
		String str[] = string.split(" ");
		System.out.print("The Reversed String :");
		for(int i= str.length-1;i>=0;i--) {
		System.out.print(str[i] +" ");
		sc.close();
		}
		
	}

}
