package kit;

public class Euler {

	private static double approximateE(int n) { // It's static , because main
		// method is also static
		// int n , because we need natural number
		double e = 1.0;
		double denominator = 1.0;
		for (int i = 1; i <= n; i++) {
			denominator *= i;
			e += 1.0 / denominator;
		}
		return e;
	}
	public static void main(String[] args) {
		// Loop for n = 5 , n = 10 , n = 15 and n = 20
		for (int j = 5; j <= 20 ; j+=5) {
			System.out.println(approximateE(j)); 
		}
				}
}


