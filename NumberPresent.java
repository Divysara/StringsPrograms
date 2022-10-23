import java.util.stream.IntStream;

public class NumberPresent {

	
	public static void normal() {
		
		int array[] = {1,4,7,9,3,9};
		int noToFind = 9;
		boolean present = false;
		for(int number : array) {
			if(number==noToFind)
				present = true;	
		}
		if(present)
			System.out.println("No " + noToFind+ " is present!");
		else
			System.out.println("No " + noToFind+ " is not present!");
	}
	public static void inStream() {
		int noToFind = 90;
		int array[] = {1,4,7,9,3,9};
		boolean noPresent = IntStream.of(array).anyMatch(element->element==noToFind);
		System.out.println(noPresent);
	
	}
	
	
	
	public static void main(String[] args) {
		normal();
		inStream();

	}

}
