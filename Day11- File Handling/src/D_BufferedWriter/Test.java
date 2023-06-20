package D_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
			FileWriter fw=new FileWriter("ABC3.txt", true);
			
			@SuppressWarnings("resource")
			BufferedWriter bw=new BufferedWriter(fw);
			
			bw.write("JAVA");
			bw.newLine();
			bw.write("PYTHON");
			bw.newLine();
			bw.write(100);
			bw.newLine();
			bw.write('A');
			bw.newLine();
			
			bw.flush();
			
			System.out.println("DONE");
	}

}
