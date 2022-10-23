import java.util.Scanner;

public class PatternProgram {

	public static void nunberPattern() {
	Scanner sc= new Scanner(System.in);
	System.out.println("No of Lines");
	int limit= sc.nextInt();
	int start =1;
	int row,column=0;
	for(row=0;row<limit;row++) 
	{
		for(column=0;column<=row;column++)
		{
			System.out.print(start);
			start =start+1;
		}
		System.out.println();
	}
	
	
}
	public static void StarPattern() {
	Scanner sc= new Scanner(System.in);
	System.out.println("No of Lines");
	int lines= sc.nextInt();
	int row,column=0;
	for(row=0;row<lines;row++) {
		for(column=0;column<=row;column++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
}

	public static void main(String[] args) {

		StarPattern();
		nunberPattern();
		
		
		
	}

}
