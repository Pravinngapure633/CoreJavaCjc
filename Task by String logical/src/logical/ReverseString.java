package logical;

public class ReverseString {
	
	static String str="ABC";
	
	
	 static String recursiveMethod(String str)
	    {
	         if ((null == str) || (str.length() <= 1))
	         {
	                return str;
	         }
	 
	         return recursiveMethod(str.substring(1)) + str.charAt(0);
	    }
	 
	 public static void main(String[] args) {
		
		  System.out.println(recursiveMethod(str));
		  
		  //or
		  
		  StringBuffer sbf = new StringBuffer(str);
		  
	        System.out.println(sbf.reverse()); 
	        
	        //or
	        char[] array = str.toCharArray();
	        for(int i=array.length-1;i>=0;i--)
	        {
	        	System.out.println(array[i]);
	        }
	        System.out.println();
	 }

}
