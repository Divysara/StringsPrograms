
public class ExtractNumber {
	
	public static void addNumbers() {
		
		String string = "divya84";
		int sum=0;
		for(int i=0;i<string.length();i++) {
			char c =string.charAt(i);
			if(Character.isDigit(c)) {
				sum=sum+Character.getNumericValue(c);
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {

		String alphanumeric = "avfgb1267hjfjg90";
		
		String numeric=alphanumeric.replaceAll("[^0-9]", "");
		String alpha = alphanumeric.replaceAll("[0-9]", "");
		System.out.println("Only Alphabets: " +alpha);
		System.out.println("Only Numbers: " +numeric);
		addNumbers();
	}

}
