package E_PrintWriter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {
	
	public static void main(String[] args) throws IOException  {
		
			//File f=new File("ABC4.txt");
			
			PrintWriter pw=new PrintWriter("ABC4.txt");
			
			pw.write("JAVA");
			pw.write("\n");
			pw.write(99);//c
			pw.write("\n");
			pw.write('B');
			pw.write("\n");
			
			pw.print(true);
			pw.print("\n");
			pw.print(99);
			
			pw.println();
			pw.println(100);
			pw.println("PYTHON");
			
			pw.flush();
			System.out.println("DONE");
	}

}
