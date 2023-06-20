package D_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
	
	public static void main(String[] args) throws IOException {
		
		//ABC3 file madhe append kel data ajun
		FileWriter fw=new FileWriter("ABC3.txt", true);
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("PRAVIN");
		bw.newLine();
		bw.write("QQQ");
		
		bw.flush();
		
		System.out.println("Done");
	}

}
