import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringExample {

	public static void main(String[] args) {
		
		// pgm to reverse the string word by word

		String s  = " hi java class welcome";
		char c[] = s.toCharArray();
		String reversed ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reversed= reversed+c[i];
		}
		System.out.print(reversed);
		//o/p:emoclew ssalc avaj ih 
		
		//2.another way using reverse method()
		System.out.println();
		StringBuffer buffer = new StringBuffer(s);
		System.out.println(buffer.reverse());
		
		//3.another way using collections
		List<Character> listarray = new ArrayList<Character>();
		for(Character character:c) {
			listarray.add(character);	
		}
		Collections.reverse(listarray);
		ListIterator<Character> iterator = listarray.listIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}	
	}
}
