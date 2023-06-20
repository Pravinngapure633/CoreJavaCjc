package setterandgetter;

import java.util.Scanner;

public class C_result_add {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		C_Addtion c = new C_Addtion();
		c.setNum1(sc.nextInt(),sc.nextInt());
		System.out.println(c.getNum1());
		sc.close();
	}

}
