
public class TrimFunction {

	
	public static void main(String[] args) {

		
		String s = " hello world ";
		System.out.println(s);
		System.out.println(s.trim());//removes white space
		System.out.println(s.strip());//same removes white space before an after
		System.out.println(s.stripLeading());//front space removed
		System.out.println(s.stripTrailing());//end space removed
	
		System.out.println(s.replaceAll("^[ \t]+|[ \t]+$", ""));
		System.out.println(s.replaceAll("^[ \t]", ""));//front space removed
		System.out.println(s.replaceAll("[ \t]+$", ""));//end space removed	
		
	}

}
