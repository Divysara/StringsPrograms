
public class CountVowels {

	public static void main(String[] args) {
		String s = "I love Java";
		int count=0;

		char c[]=s.toCharArray();

		for (int i=0;i<s.length();i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
				count++;
		}

		System.out.println("No of Vowels: " +count);

	}

}
