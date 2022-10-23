
public class Recursion {

	public static void main(String[] args) {
		int result =sum(2);
		System.out.println("The sum : "+ result);

	}
	public static int sum(int i) {
		if(i>0) {
			System.out.println(i);
		return i+sum(i-1);}
		else
			return 0;
	}

}
