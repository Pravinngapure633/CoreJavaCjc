package A_Interface;

public class Test_Co_My_Or {
	
	public static void main(String[] args) {
		
			Connection con=new Mysql();
			con.commit();
			con.rollback();
			
			Connection con1=new Oracal();
			con1.commit();
			con1.rollback();
			
			
	}

}
