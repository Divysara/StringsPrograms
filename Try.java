import java.util.regex.Pattern;

public class Try {

	
		static String reverseWords(String str)
	    {
	 
	        // Specifying the pattern to be searched
	        Pattern pattern = Pattern.compile("\\s");
	 
	        // splitting String str with a pattern
	        // (i.e )splitting the string whenever their
	        // is whitespace and store in temp array.
	        String[] temp = pattern.split(str);
	        String result = "";
	 
	        // Iterate over the temp array and store
	        // the string in reverse order.
	        for (int i = 0; i < temp.length; i++) {
	            if (i == temp.length - 1) {
	                result = temp[i] + result;
	            System.out.println("1:" +result);}
	            else {
	                result = " " + temp[i] + result;
	                System.out.println("2:" +result);}
	        }
	        return result;
	    }
		public static void main(String[] args) {
			
			String s1 = "Welcome to geeksforgeeks";
	        System.out.println(reverseWords(s1));
	}

}
