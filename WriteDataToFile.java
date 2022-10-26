import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteDataToFile {

	public static void main(String[] args) throws Exception {

		
		
		FileWriter fw= new FileWriter("writetext.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("hello");
		bw.write("can i add more lines");
		bw.write("let's see if it adds");
		
		System.out.println("fiinished writing");
		bw.close();
		
				
	}

}
