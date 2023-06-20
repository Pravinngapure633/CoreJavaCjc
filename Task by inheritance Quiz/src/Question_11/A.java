package Question_11;
// Que- What is wrong with the below code? Why it is showing compile time error?
public class A {
	
	  public A()
	    {
	        System.out.println(1);
	 
	        super();
	 
	        System.out.println(2);
	    }

}

// ans- Super();-- must be 1st line
//		Constructor calling statements ( super() or this() ), if written, must be the first statements in the constructor.
