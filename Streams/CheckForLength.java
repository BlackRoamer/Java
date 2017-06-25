package streams;

import java.util.Arrays;
import java.util.Scanner;

public class CheckForLength {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int limitLength = scan.nextInt();
    scan.nextLine();
    String line = scan.nextLine();
    Arrays.stream(line.split(" ")).filter(x -> x.length() <= limitLength)
    .forEach(x -> System.out.println(x));
}
}
