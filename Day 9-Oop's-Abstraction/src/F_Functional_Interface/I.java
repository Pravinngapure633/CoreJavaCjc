package F_Functional_Interface;

@FunctionalInterface
public interface I {

		//functional interface have only one abstract method  
		void m1();
		
		
		//only default and static method can write . multiple default and static method can write
		default void m2()
		{
			System.out.println("I--M2");
		}
}
