package setterandgetter;

public class B_result_bank {
	
	public static void main(String[] args) {
		
		B_Bank b = new B_Bank();
		
		b.setName("pravin");
		b.setAdd("pune-411033");
		b.setMobile(8668238906l);
		b.setAmount(88880.20f);
		
		System.out.println("name is :"+b.getName());
		System.out.println(b.getAdd());
		System.out.println(b.getMobile());
		System.out.println(b.getAmount());
		
	}
}
