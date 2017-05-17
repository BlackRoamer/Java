package softuni;

public class BlankReceipt {
public static void main(String[] args) {
printReceipt();
}
private static void printReceipt() {
	printHeader();
	printBody();
	printFooter();	
}

private static void printFooter() {
	// TODO Auto-generated method stub
	System.out.println("--------------------");
	System.out.println("© SoftUni");
}

private static void printBody() {
	// TODO Auto-generated method stub
	System.out.println("CHARGED TO___________");
	System.out.println("RECEIVED BY_____________");
	
}

private static void printHeader() {
	// TODO Auto-generated method stub
	System.out.println("CASH RECEIPT");
	System.out.println("--------------------");
	
}
}
