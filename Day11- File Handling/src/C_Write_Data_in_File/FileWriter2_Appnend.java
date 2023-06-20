package C_Write_Data_in_File;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter2_Appnend {
	
	public static void main(String[] args) throws IOException {
		
			
			//appnend
			FileWriter fw=new FileWriter("ABC2.txt", true);
			
			
			fw.write("JAVA");
			fw.write("\n");
			fw.write("PYTHON");
			
			fw.flush();
			
			System.out.println("DONE");
	}

}
