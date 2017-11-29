package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reverse {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String line = scan.nextLine();
	int divider = scan.nextInt();
	// Better performance, but not reverse
	int[] nums = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

	Arrays.stream(nums).filter(n -> n % divider != 0).forEach(x -> System.out.print(x + " "));
	System.out.println();
	System.out.println("With list : ");
	List<Integer> elements = Arrays.stream(line.split(" ")).mapToInt(x -> Integer.parseInt(x)).boxed()
		.collect(Collectors.toList());
	elements.stream().filter(n -> n % divider != 0).sorted((a1, a2) -> a2.compareTo(a1))
		.forEach(x -> System.out.print(x + " "));
    }
}
