package practice;

import java.util.Scanner;

//SWAP METHOAD
public class Excersise15 {
	 public static void main(String[] args) {
	     
//		   int a, b, temp;
//		   a = 15;
//		   b = 27;
//		   System.out.println("Before swapping : a, b = "+a+", "+ + b);
//		   temp = a;
//		   a = b;
//		   b = temp;   
//		  System.out.println("After swapping : a, b = "+a+", "+ + b);

		 //with scanner
		 int x, y, z;
		   Scanner in = new Scanner(System.in);

		   System.out.println("Input the first number: ");
		   x = in.nextInt();
		   System.out.println("Input the second number: ");
		   y = in.nextInt();

		   z = x;
		   x = y;
		   y = z;

		   System.out.println(" Swapped values are3:" + x + " and " + y);
		in.close();  
	 }
	 }
	 


