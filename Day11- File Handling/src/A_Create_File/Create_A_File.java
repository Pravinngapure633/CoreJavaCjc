package A_Create_File;

import java.io.File;
import java.io.IOException;

public class Create_A_File {
	
	public static void main(String[] args) throws IOException {
		
			
			File f=new File("ABC.txt");
			
			//f.createNewFile();
			System.out.println(f.createNewFile());
			
			System.out.println("File_Created");
			
			
	}

}
