package B_Create_Folder;

import java.io.File;

public class Create_A_Folder {

	public static void main(String[] args) {
		
			File f=new File("DEMO");
			
			
			//f.mkdir();  directory
			
			System.out.println(f.mkdir());
			
	}
}
