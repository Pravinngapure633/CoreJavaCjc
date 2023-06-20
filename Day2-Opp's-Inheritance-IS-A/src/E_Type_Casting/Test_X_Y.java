package E_Type_Casting;

public class Test_X_Y {
	
		public X m1()
		{
			Y y=new Y();
			y.x=100;
			return y;
		}
		
		public static void main(String[] args) {
			
				Test_X_Y t = new Test_X_Y();
				Y c=(Y)t.m1();
				System.out.println(c.x);
		}
}
