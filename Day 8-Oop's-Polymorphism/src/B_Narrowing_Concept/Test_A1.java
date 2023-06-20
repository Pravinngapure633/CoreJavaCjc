package B_Narrowing_Concept;

public class Test_A1 {
	
	public static void main(String[] args) {
			
			A1 a=new A1();
			//a.m1(null);	--AMBIGUOUS ERROR
			a.m1((Object)null);
			a.m1((String)null);
			a.m1((A1)null);
	}

}
