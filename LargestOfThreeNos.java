
public class LargestOfThreeNos {

	public static void main(String[] args) {

		int a = 100, b= 20, c =500;
		
		// Ternary Operator
		
		int largest1 = a>b?a:b;
		int largest2 = largest1>c?largest1:c;
		System.out.println("Largest no : "+ largest2);
		
	
	}

}
