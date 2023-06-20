package G_Throw;

public class AgeInvalidException_2 extends RuntimeException
{
	public AgeInvalidException_2(String msg) 
	{
		super(msg);
	}
	
	@Override
	public String getMessage()
	{
		return "Due to invalid age";
	}
}
