package Question_26;

public class A {

	public A(int i)
    {
        System.out.println(myMethod(i));
    }
 
    int myMethod(int i)
    {
        return ++i + --i;
    }
}
