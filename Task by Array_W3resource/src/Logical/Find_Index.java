package Logical;

public class Find_Index {
	
	public static int  findIndex (int[] my_array, int t) 
	{
      
        int i = 0;
        while (i < my_array.length) //
        {
            if (my_array[i] == t)
            {
            	return i;
            }
            else 
            	{
            	i=i+1;
            	}
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
      System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
      System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
       }

}
