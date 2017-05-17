package softuni;
import java.util.Scanner;

public class LightYearsConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter light years : ");
		double lightYear = scan.nextDouble();
		double distanceOneLightYear = 945000000;
		double distanceCalculator = lightYear * distanceOneLightYear;
		String result = String.format("%.2f",distanceCalculator);
		System.out.println(result + "km");
	}
}
