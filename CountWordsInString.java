import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		//count words in a string:

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");

		String enter = sc.nextLine();
		int count =1;

		for(int i=0;i<enter.length();i++)
		{
			if((enter.charAt(i)==' ')&&(enter.charAt(i+1)!=' '))
				count++;
		}
		System.out.println("The no of words in the string : "+ count);
		sc.close();
	}

}
