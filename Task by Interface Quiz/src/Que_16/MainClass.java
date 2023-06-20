package Que_16;

public class MainClass {
	
	  public static void main(String[] args)
	    {
	        ABC abc = new MNO();
	         
	        abc.methodOne();
	    }


Yes, program is written is correctly. But, 
//it will throw StackOverflowError at run time.
//Because, methodOne() and methodTwo() are cyclicly called.
}