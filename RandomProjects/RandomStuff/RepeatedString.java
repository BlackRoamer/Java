package softuni;

import java.util.Scanner;

public class RepeatedString {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	int count = scan.nextInt();
	String result = getRepeatedString(str, count);
	System.out.println(result);
}
private static String getRepeatedString(String str, int count) {
	String repeatedString = str;
	String result = "";
	for (int i = 1; i <= count; i++) {
		result = result + repeatedString;
	}
	return result;
}
}
