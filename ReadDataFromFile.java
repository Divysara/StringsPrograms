import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadDataFromFile {

	public static void main(String[] args) throws Exception {

		//approach 1:
		FileReader fr= new FileReader("javatext.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
		
		//approach 2:
		File file = new File("javatext.txt");
		
		Scanner sc= new Scanner(file);
		/*
		 * while(sc.hasNextLine()) 
		 * { 
		 * System.out.println(sc.nextLine());
		 *  }
		 */
		
		//aproach 3:
		
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
		sc.close();
			
	}

}
