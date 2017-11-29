package streams;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AllDividedBy {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int limitNumber = Integer.parseInt(scan.nextLine());
    String input = scan.nextLine();
    int[] divisors = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
    
    IntStream.rangeClosed(1, limitNumber)
    .filter(n ->  IntStream.of(divisors).allMatch(d -> n % d == 0))
    .forEach(x -> System.out.print(x + " "));
    
    
}
}
