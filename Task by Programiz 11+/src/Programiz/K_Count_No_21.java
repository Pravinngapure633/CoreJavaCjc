package Programiz;

public class K_Count_No_21 {
	 public static void main(String[] args) {

		    
		    int num = 0003452;
		    int count = 0;
		    while (num != 0) {
		      // num = num/10
		      num /= 10;
		      System.out.println("Number of digits: " + count);
		      ++count;
		    }

		    
		  }

}
