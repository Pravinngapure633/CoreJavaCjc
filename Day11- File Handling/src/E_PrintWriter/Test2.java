package E_PrintWriter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Test2 {
	
	public static void main(String[] args) throws IOException {
		
		//File f=new File("ABC4.txt");
		PrintWriter pw=new PrintWriter("ABC4.txt");
		
		pw.println();
		pw.println("NEW-Data");
		pw.println("New1");
		
		pw.flush();
		
		System.out.println("DOne");
	}
	

}
