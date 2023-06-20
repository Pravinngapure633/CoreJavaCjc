package Que_6;

public class B implements A {

	void methodB()
	{
		i=222;
	}
}
//No, because interface fields are static and final by default 
//and you can’t change their value once they are initialized.
//In the above code, methodB() is changing value of interface field A.i.
//It shows compile time error.