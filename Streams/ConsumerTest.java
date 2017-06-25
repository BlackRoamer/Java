package streams;

import java.util.Arrays;
import java.util.function.Consumer;


public class ConsumerTest {
    public static void main(String[] args) {
	String names = "John Alex Peter";
	String[] nameess = {"John", "Alex","Peter"};
	String name = "John                    Pesho    Alert";
	Arrays.stream(name.split(" +")).forEach(n -> System.out.println("Sir " + n));
	
	Arrays.stream(names.split(" ")).forEach(n -> System.out.println(n));
	Arrays.stream(names.split(" ")).forEach(n -> System.out.println("Sir " + n));
	
	
	String nums = "1 2 3 4 12 -9 16 22 -69";
	int min = Arrays.stream(nums.split(" ")).map(n -> Integer.parseInt(n))
	.min((a1,a2) -> a1.compareTo(a2)).get();
	System.out.println(min);
	
	/*
	Consumer<String> cons = x -> System.out.println(x);
	for (String s : nameess) {
	    cons.accept(s);
	}
	*/
//	cons.accept(names);

    }
}
