package setterandgetter;

public class B_Bank {
	
	private String name;
	private String add;
	private long mobile;
	private float amount;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAdd(String add)
	{
		this.add=add;
	}
	public String getAdd() 
	{
		return add;
	}
	
	public void setMobile(long mob)
	{
		mobile=mob;
	}
	public long getMobile() {
		return mobile;
	}
	
	public void setAmount(float amo)
	{
		amount=amo;
	}
	public float getAmount()
	{
		return amount;
	}
}
