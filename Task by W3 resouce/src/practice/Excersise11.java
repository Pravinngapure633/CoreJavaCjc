package practice;

import java.util.Scanner;

public class Excersise11 {

	public static void main(String[] args) {
		  Scanner io = new Scanner(System.in);
		  System.out.println("Input the radius of the circle: ");
		  double radius = io.nextDouble();
		  System.out.println("Perimeter is = " + (2 * radius * 3.14));
		  System.out.println("Area is = " + (3.14 * radius * radius));
		 io.close();
		 }
}
