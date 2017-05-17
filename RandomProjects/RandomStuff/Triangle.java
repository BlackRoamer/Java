package softuni;

import java.util.Scanner;

public class Triangle {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	System.out.println("Enter a :");
	int a = scan.nextInt();
	System.out.println("Enter b :");
	int b = scan.nextInt();
	System.out.println("Enter c :");
	int c = scan.nextInt();
	boolean formula = ((a + b) > c) && ((a +  c) > (b))
			&& a < (b + c);
	boolean rightTriangle = (a * a + b * b)
			== c * c || (a * a + c * c)
			== b * b || (c * c + b * b)
			== a * a;
	
	if (formula) {
		System.out.println("Triangle is valid"); 
		 if (rightTriangle) {
			
		if (b > c) {
		System.out.println("Triangle has a right angle between sides a and c"); }
	  if (c > b )  {
		System.out.println("Triangle has a right angle between sides a and b");
	}
		
	} else {
		System.out.println("Triangle has no right angles");
	}
	}
	else {
		System.out.println("Invalid triangle");
	}
	
}
}
