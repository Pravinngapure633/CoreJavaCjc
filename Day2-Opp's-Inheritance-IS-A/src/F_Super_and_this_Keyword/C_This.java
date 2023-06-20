package F_Super_and_this_Keyword;

public class C_This {
	
		public C_This(int i, String s)
		{
					this.m2();
					//this();			//Constructor must be 1st write
		}
		
		public   C_This()
		{
			this(10,"1");
			System.out.println("Const--C");
		}
		
		public void m1() {
			System.out.println("M1--C");
		}
		
		public void m2() {
			this.m1();
			System.out.println("M2--C");
		}

}
