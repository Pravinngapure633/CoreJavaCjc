package Question_10;

public class MainClass {

	public static void main(String[] args)
    {
        X x = new Y();
 
        x.calculate(10, 20);
 
        Y y = (Y) x;
 
        y.calculate(50, 100);
 
        Z z = (Z) y;
 
        z.calculate(100, 200);
    }
}
//o/p= class X
//	 class y
//	 Line 39 (Z z = (Z) y) will throw java.lang.ClassCastException at run time.
//	 Because, Y cannot be cast to Z.
