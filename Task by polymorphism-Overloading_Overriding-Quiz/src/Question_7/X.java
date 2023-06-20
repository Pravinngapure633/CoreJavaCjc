package Question_7;

public class X {
	
	double overloadedMethod(double d)
    {
        return d *= d;
    }
 
    int overloadedMethod(int i)
    {
        return overloadedMethod(i *= i);		//return methoad calling and condition
    }
 
    float overloadedMethod(float f)
    {
        return overloadedMethod(f *= f);
    }
 
    public static void main(String[] args)
    {
        X main = new X();
 
        System.out.println(main.overloadedMethod(100));
    }



ans-It will throw java.lang.StackOverflowError at run time.
	Because, overloadedMethod(int) keeps calling itself.
}