import java.util.Scanner;

public class PositionOfAlphabet {

	public static void upperCase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char character= sc.next().charAt(0);
		character=Character.toUpperCase(character);
		int asciiValue = (int)character-64;
		System.out.println(asciiValue);
		sc.close();
		
	}
	
	public static void lowerCase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char character= sc.next().charAt(0);
		character=Character.toLowerCase(character);
		int asciiValue =(int)character-96;
		System.out.println(asciiValue);
		sc.close();
		
	}
	
	public static void main(String[] args) {

		upperCase();
		lowerCase();
		
		
	}

}
