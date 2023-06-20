package C_Write_Data_in_File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

		public static void main(String[] args) throws IOException {
			
				File f=new File("ABC1.txt");
				
				f.createNewFile();
				
				FileWriter fw=new FileWriter(f);
				
				fw.write(100); //aske value =d
				fw.write("ABC");
				fw.write('A');
				
				fw.flush();
				
				System.out.println("Created");
				
				
				
		}
}
