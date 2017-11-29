package streams;

import java.util.Arrays;
import java.util.Scanner;


public class ComparatorEvensOdds {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine();
    int nums[] = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
    Arrays.stream(nums).filter(x -> x % 2 == 0)
    .forEach(x -> System.out.print(x + " "));
    Arrays.stream(nums).filter(x -> x % 2 != 0)
    .forEach(x -> System.out.print(x + " "));
}
}
