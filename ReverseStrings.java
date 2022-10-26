
public class ReverseStrings {

	static String sent;

	public static void revWordByWord(String s) {
		sent = s;

		String strarr[] = s.split(" ");

		for(int i =strarr.length-1;i>=0;i--) {
			System.out.print(strarr[i]+ " ");
		}
		System.out.println();

	}
	public static void main(String[] args) {

		String s  = "Believe that You can do it";
		System.out.println("Original String : " + s);
		System.out.println("-----------------" );
		revWordByWord(s);

		//1.reverse word by word

		char ch[]  = s.toCharArray();
		String reverse= "";

		System.out.println("Reversed using char[] method: " );
		System.out.println("-----------------------------" );
		for(int i=ch.length-1; i>=0;i--)
		{
			reverse=  reverse+ch[i];
		}
		System.out.print(reverse);
		System.out.println();

		// 2.reversing using charAT Method:

		String reverse2= "";
		for(int i=s.length()-1;i>=0;i--) 
		{
			reverse2=  reverse2+s.charAt(i);
		}
		System.out.println("After Reversing using CharAT: ");
		System.out.println("-------------------------------" );
		System.out.println(reverse2);

		//3.reverse the word in a string without reversing entire string:

		String str = "welcome to java";
		String reverseString ="";

		String words[] = str.split(" ");
		
		for(String w:words)

		{
			String reverseword="";


			for(int i=w.length()-1;i>=0;i--)
			{

				reverseword=reverseword+w.charAt(i);
			}

			reverseString = reverseString+reverseword+" ";
		}
		System.out.println("The reversed word in the string : \n"+ reverseString);
		
		//4.using string buffer
		
		System.out.println("String Buffer:");
		System.out.println("--------------");
		System.out.println("Original String: " + str);
		String buffreverse = "";
		 for(String b : words) 
		 {
			 StringBuffer buff = new StringBuffer(b);
			 buff.reverse();
			 buffreverse=buffreverse+buff.toString()+" ";
				
		 }
		 System.out.println(buffreverse);
		 
		 
	}


}


