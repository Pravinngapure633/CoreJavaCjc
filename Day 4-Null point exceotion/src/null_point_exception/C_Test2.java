
package null_point_exception;

public class C_Test2 {
		public static void main(String[] args) {
			String s=null;
			char c=s.charAt(0);
			
			//nullpoint exception
			System.out.println(c);
			
			String s1=null;
			String str=s1.toLowerCase();
			System.out.println(str);
			
		}
}
