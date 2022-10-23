
public class FindLength {

	public static void main(String[] args) {

		String name = "DhivyaSarangaraja";
		char c[] = name.toCharArray();
		int length=0;
		for(char carray : c) {
			length++;
			System.out.print(carray);
		}
		System.out.println("  The Length of the string: "+length);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE );
	}
	

}
