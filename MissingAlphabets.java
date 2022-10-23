import java.util.Arrays;
import java.util.HashSet;

public class MissingAlphabets {
// pgm for PANGRAM- finding missing alphabets in the given string
	public static void main(String[] args) {

		String given = "xyz";
		String userarray[]=given.split("");
		String alpha[]="abcdefghijklmnopqrstuvwxyz".split("");
		
		HashSet<String> set1= new HashSet<String>(Arrays.asList(userarray));
		HashSet<String> set2= new HashSet<String>(Arrays.asList(alpha));
		set2.removeAll(set1);
		System.out.println(set2);

	}

}
