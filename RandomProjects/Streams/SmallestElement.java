package streams;

import java.util.Arrays;
import java.util.Scanner;


public class SmallestElement {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine();
    int[] elements = Arrays.stream(line.split(" +")).mapToInt(Integer::parseInt).toArray();
    int min = Arrays.stream(elements).min().getAsInt();
    int indexOfMin = 0;
    for (int i = 0; i < elements.length; i++) {
	if (min == elements[i]) {
	    indexOfMin = i;
	    break;
	}
    }
    System.out.println(indexOfMin);
    
    
 
}
}
