package A_Interface;

public class Oracal implements Connection {

	@Override
	public void commit()
	{
		System.out.println("commit--oracal");
		
	}

	@Override
	public void rollback() 
	{
		System.out.println("rollback--oracal");
		
	}

}
