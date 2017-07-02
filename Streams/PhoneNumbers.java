import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumbers {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String regexNames = "[A-Z][a-z]*";
    String regexPhones = "((\\+*\\d+)+(\\.*\\-*\\ *\\(*\\)*)*\\/*)+";
    String line = scan.nextLine();
    List<String> storedNames = new LinkedList<>();
    while (!line.equals("END")) {
    Pattern patternForNames = Pattern.compile(regexNames);
    Matcher matcherForNames = patternForNames.matcher(line);
    Pattern patternForNumbers = Pattern.compile(regexPhones);
    Matcher matcherForNumbers = patternForNumbers.matcher(line);
    

    if  (matcherForNumbers.find() && matcherForNames.find()) {
	String names = matcherForNames.group() + ": " + matcherForNumbers.group();
	
	storedNames.add(names);
    } else {
	storedNames.add("No matches!");
    }
    line = scan.nextLine();
    }
    storedNames.stream().forEach(System.out::println);

}
}
