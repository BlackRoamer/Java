package softuni;

public class NthDigit {
public static void main(String[] args) {

	System.out.println(findNthDigit(81453, 4));
	System.out.println(findNthDigit(123, 3));
	System.out.println(findNthDigit(94613768, 5));
	
}
private static int findNthDigit (long num, int index) {
	int checkIndex = 0;
	while (num >=0) {
		int digit = (int) (num % 10);
		
		if (index - 1  == checkIndex) {
			return digit;
		}
		checkIndex++;
		num = num / 10;
		
	}
	return 0;
}
}
