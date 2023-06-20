package Question_32;

public class A {
	
	 void myMethod() throws IOException
	    {
	        System.out.println("ONE");
	    }
	 
	    void myMethod() throws NumberFormatException
	    {
	        System.out.println("TWO");
	    }
	 
	    void myMethod() throws ArrayIndexOutOfBoundsException
	    {
	        System.out.println("THREE");
	    }
//	  que-  In the below class A, ‘myMethod()’ has three different forms.
//	    All are throwing different exceptions, but have same signature. Is it OK?
//	ans- It is not Ok. You will get duplicate method error.
}
