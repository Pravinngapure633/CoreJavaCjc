package dom;
import java.util.*;
public class Calculator {

		public void Addition() {			//non-parameterized
			int a=100;
			int b=200;
			int result=a+b;
		System.out.println("ADDITION IS: "+result);
			
		}
		
		public void Addition(int c, int d) {		//parametrized
			int result= c+d;
			System.out.println("ADDITION IS: "+result);
		}
		
		public static void main(String[] args) {
		Calculator c = new Calculator();
			c.Addition();
			c.Addition(30,40);
		}
		
}
