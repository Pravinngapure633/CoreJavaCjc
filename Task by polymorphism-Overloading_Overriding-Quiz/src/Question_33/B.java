package Question_33;

import java.sql.SQLException;

public class B extends A{

	
	@Override
    void myMethod() throws SQLException
    {
        System.out.println("Sub Class");
    }
}
//SQLException is not compatible with throws clause of super class method. 
//If super class method doesn’t have throws clause, then it can be overridden
//with only unchecked type of exceptions. SQLException is not an unchecked type
//of exception.
