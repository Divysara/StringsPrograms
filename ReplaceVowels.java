
public class ReplaceVowels {
	public static void vowels() {
		String s = "I love you";
		
		char c[]=s.toCharArray();
		
		for (int i=0;i<s.length();i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
				c[i]='*';
					}
		s=String.valueOf(c);//it converts char array to string
		System.out.println(s);
	}
	public static void regex() {
		String s = "I love you";
		String replaced = s.replaceAll("[AEIOUaeiou]", "*");
		System.out.println(replaced);
	}
	public static void main(String[] args) {
vowels();
regex();
	}

}
