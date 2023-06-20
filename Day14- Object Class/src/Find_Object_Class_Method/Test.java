package Find_Object_Class_Method;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c=Class.forName("java.lang.Object"); 
		
		Method [] method=c.getDeclaredMethods();
		int count=0;
		for(int i=0;i<method.length;i++)
		{
			Method method1=method[i];
			System.out.println(method1);
			count++;
		}
		System.out.println("Total Method is :"+count);
		
		//find parameter
//		int count=0;
//		for(int i=0;i<method.length;i++)
//		{
//			Method method1=method[i];
//			System.out.println(method1.getParameterCount());
//			count++;
//		}

}
} 
