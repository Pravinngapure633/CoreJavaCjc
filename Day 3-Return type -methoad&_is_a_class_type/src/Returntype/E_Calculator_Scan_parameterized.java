package Returntype;

		//PARAMETRIZED
public class E_Calculator_Scan_parameterized {  
			

	public int Add(int x, int y) {
		int result = x + y;
		System.out.println("ADD IS"+result);
		return result;
	}

	public int Sub(int x, int y) {
		int result = x - y;
		System.out.println("SUB IS"+result);
		return result;
	}

	public int Multi(int x, int y) {
		int result = x * y;
		System.out.println("MULTI IS"+result);
		return result;
	}

	public int Divi(int x, int y) {
		int result = x / y;
		System.out.println("DIVI IS"+result);
		return result;
	}

}
