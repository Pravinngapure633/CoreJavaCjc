package Question_16;

public class N extends M{
		
		static
		{
			System.out.println("D");
		}
		
		//non static block
		{
			System.out.println("E");
		}
		
		public N() {
			System.out.println("F");
		}

}
