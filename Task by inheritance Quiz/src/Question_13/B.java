package Question_13;

public class B extends A {

//	public B()
//	{
//		//super(10); --- imp 
//	}

}

// ans-- Class B doesn’t have any constructors written explicitly. 
//So, compiler will keep default constructor. In that default constructor, there
//will be a calling statement to super class constructor (super()). 
//But, it is undefined in Class A.To remove the errors, either define A() constructor
//in class A or write B() constructor in class B and call super class constructor explicitly.
