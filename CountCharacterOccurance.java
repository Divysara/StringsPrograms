
public class CountCharacterOccurance {

	public static void main(String[] args) {

		
		String name = "Dhivya sarangaraja";
		char c= 'r';
		int totallength = name.length();
		int afterRemoving = name.replace("r","").length();
		int countOccurance = totallength-afterRemoving;
	System.out.println("The character "+c+ " occured "+ countOccurance + " times");
	
	
	}

}
