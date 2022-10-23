
public class ElementPresent {
	
	
public static void letterPresent() {
	
	String s = "welcome";
	char charToFind='i';
	int occurence=0;
	for(int i =0;i<s.length();i++)
{
	if(s.charAt(i)==charToFind)
		occurence++;
}
	System.out.println("The character "+charToFind+ " is found " +occurence+ " times" );
}
public static void withoutIteration() {
	
	String word= "advait";
	int s = word.length();
	char toFind = 'a';
	String replaceword = word.replaceAll(Character.toString(toFind), "");
	int r = replaceword.length();
	System.out.println("The character a occured " + (s-r)+ " times");
	
}
	public static void main(String[] args) {

		letterPresent();
		withoutIteration();
	}

}
