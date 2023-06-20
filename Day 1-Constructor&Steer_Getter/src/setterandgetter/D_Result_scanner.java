package setterandgetter;

import java.util.Scanner;

public class D_Result_scanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		D_scanner s = new D_scanner();
		s.setNum1(sc.nextInt());
		s.setNum2(sc.nextInt());
		System.out.println(s.getNum1());
		System.out.println(s.getNum2());
		sc.close();
	}
		
}
