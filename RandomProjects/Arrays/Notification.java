package softuni;

import java.util.Scanner;

public class Notification {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Scanner scan1 = new Scanner(System.in);
	int n = scan1.nextInt();
		for (int i = 1; i <= n; i++) {
		String command = scan.nextLine();
		switch (command) {
		case "success" : 
			String operationInput = scan.nextLine();
			String message = scan.nextLine();
			String testSuccess = showSucces(operationInput, message);
			System.out.println(testSuccess);
			break;
		case "error" :
			String operationErrorInput = scan.nextLine();
			int intInput = scan1.nextInt();
			String testError = showError(operationErrorInput, intInput);
			System.out.println(testError);
			break;
			default : break;
		}
	}
}
private static String showSucces(String operation, String message) {
		String operationResult = "Successfully executed " + operation 
				+ ".\n"; 
		String messageResult = "Message: " + message +".\n";
		String finalResult = operationResult +  "==============================\n"
		+ messageResult;
		return finalResult;
}
private static String showError(String operation, int code) {
	String operationResult = "Error: Failed to execute " + 
			operation + ".\n";
	String errorResult = "Error Code: " + code + ".\n";
	String reason = "";
	
	if (code > 0) {
		reason = "Invalid Client Data";
	}
	else if (code < 0) {
		reason = "Internal System Failure";
		
	}
	else {
		reason = "";
	}
	String reasonResult = "Reason : " + reason + ".\n";
	return operationResult + "==============================\n" +
	errorResult + reasonResult;
	
}
}
