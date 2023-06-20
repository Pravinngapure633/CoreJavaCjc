package Question_5;

public class X {
	//Overloading
	int method(int i, int d)
    {
        return i+d;
    }
 
    static int method(int i, double d)
    {
        return (int)(i+d);
    }
 
    double method(double i, int d)
    {
        return i+d;
    }
 
    static double method(double i, double d)
    {
        return i+d;
    }
    
    public static void main(String[] args) {
		
    	X x=new X();
    	System.out.println(x.method(10, 20));
    	System.out.println(method(10, 20.20));  //or x.method(10,20.20)
    	System.out.println(x.method(10.2, 0));
    	System.out.println(method(10.10,0.0));
    	
    	
	}

}
