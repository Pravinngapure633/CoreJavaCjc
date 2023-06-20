package Question_21;

public class A {
	
	static String s = "AAA";
	 
    static
    {
        s = s + "BBB";
    }
 
    {
        s = "AAABBB";
    }

}
