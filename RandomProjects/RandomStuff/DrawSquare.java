package softuni;

import java.lang.annotation.Repeatable;
import java.util.Scanner;

public class DrawSquare {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	drawSquare(n);
	
}
private static void drawSquare(int n) {
	drawHeader(n);
	System.out.println();
	for (int i = 1; i <= n-2; i++) {
		drawBody(n);	
	}
	
	drawHeader(n);
}
private static void drawHeader(int n) {
	repeat("-", n*2);
	
}
private static void drawBody(int n) {
	System.out.print('-');
	
		repeat("\\/", n-1);	
		
	
	
	System.out.println('-');
}
private static void repeat(String str, int n) {
	for (int i = 1; i <=n ; i++) {
		System.out.print(str);
	}
}
}
