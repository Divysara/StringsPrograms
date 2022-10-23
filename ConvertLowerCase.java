
public class ConvertLowerCase {

	public static void lower() 
	{
		String s = "Hello Welcome dHIVYA";

		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++) 
		{
			if(c[i]>=65 && c[i]<=90) 
				c[i]= (char)(c[i]+32);
			
		}
		System.out.println(String.copyValueOf(c));
		
	}
	public static void upper() {
		String s = "Hello Welcome dHIVYA";

		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++) 
		{
			if(c[i]>=97 && c[i]<=122) 
				c[i]= (char)(c[i]-32);
			
		}
		System.out.println(String.copyValueOf(c));
		

	}
	public static void main(String[] args) {

		lower();
		upper();
	}

}
