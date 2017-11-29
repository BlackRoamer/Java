package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintEvensOrOdds {
public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine();
    String input = scan.nextLine();
    String odd = "odd";
    String even = "even";
    List<Integer> intList = Arrays.stream(line.split(" ")) 
	    .mapToInt(x -> Integer.parseInt(x)).sorted()
	    .boxed().collect(Collectors.toList());
    
    if (input.equals(odd)) {
	IntStream.rangeClosed(intList.get(0), intList.get(intList.size() - 1))
	   .filter(n -> n % 2 == 1).forEach(n -> System.out.print(n + " "));
    } else if (input.equals(even)) {
	IntStream.rangeClosed(intList.get(0), intList.get(intList.size() - 1))
	   .filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
    } else {
	throw new Exception("Invalid Command");
    }
}
}
