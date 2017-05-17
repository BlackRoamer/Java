package softuni;

import java.util.Scanner;

public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of passengers : ");
		int numberOfPeople = scan.nextInt();
		int vehicles = (4 + 8 + 12);
		int transportTimes = (int) Math.floor((double)(numberOfPeople / vehicles));
		System.out.println(transportTimes);
	}

}
