package softuni;

import java.util.Scanner;

public class LastConsecutiveEqualStr {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	String inputText = scan.nextLine();
	String[] words = inputText.split(" ");
	
	int count = 1;
	String result = "";

	for (int i = words.length - 1; i > 0; i--) {
		System.out.println("Words i :" + words[i] + " words i - 1 : " + words[i - 1]);
		
		if (words[i].equals(words[i - 1])){
			count++;
			
			if (count == 3) {
				result = words[i];
				break;
			}
		}  else {
			count = 1;
		}
		
	}
	for (int i = 1 ; i <= 3; i++) {
		System.out.print(result + " ");
	}
}
}
