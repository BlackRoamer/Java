package softuni;

import java.util.Scanner;

public class OverflowedByte {
public static void main(String[] args) {
	System.out.println("Enter a number : ");
	Scanner scan =new Scanner(System.in);
	int limit = scan.nextInt();
	int countOverflows = 0;
	byte variable =0;
	 
	for (int i = 0; i < limit; i++) {
		variable++;
		if (variable == 0 ) {
			countOverflows++;
					}
	}
	System.out.println(variable); 
	System.out.println("Overflowed " + countOverflows + " times" );
	//Second solution
	System.out.println(limit % 256);
	System.out.println("Overflowed " + limit / 256 + " times" ); 
}
}
