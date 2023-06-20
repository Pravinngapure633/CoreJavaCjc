package F_Functional_Interface;

public class Test_1_ANONYMOUS_CLASS {

	public static void main(String[] args) {
		
			I1 i=new I1() {

							@Override
							public void m1()
							{
								System.out.println("M1--Annonumuis");
					
							}
							
						  };
				i.m1();
			
	}
}
