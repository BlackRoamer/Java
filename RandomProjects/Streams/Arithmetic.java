package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Arithmetic {
public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine();
    String input = scan.nextLine();
    
    List<Integer> listOfInt= Arrays.stream(line.split(" ")).mapToInt(x -> Integer.parseInt(x)) 
	    .boxed().collect(Collectors.toList());
    while (!input.equals("end")) {
    if (input.equals("add")) {
	listOfInt = listOfInt.stream().mapToInt(x -> x + 1).boxed().collect(Collectors.toList());
    } else if (input.equals("multiply")) {
	listOfInt = listOfInt.stream().mapToInt(x -> x * 2).boxed().collect(Collectors.toList());
    } else if (input.equals("substract")) {
	listOfInt = listOfInt.stream().mapToInt(x -> x - 1).boxed().collect(Collectors.toList());
    } else if (input.equals("print")) {
	listOfInt.stream().forEach(x -> System.out.print(x + " "));
    } else {
	throw new Exception("INVALID COMMAND");
    }
    input = scan.nextLine();
    }
}
}
