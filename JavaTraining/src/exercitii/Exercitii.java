package exercitii;

public class Exercitii {

	public static void main(String[] args) {

		int n = 13;
		// System.out.println(isPrime(n));
		if (isPrime(n)) {
			System.out.println("Nr " + n + " " + "este prim");
		} else {
			System.out.println("Nr " + n + " " + "nu este prim");

		}
	}

	public static boolean isPrime(int n) {
		int counter = 0;

		if (n < 0) {
			throw new ArithmeticException("negative nr");

		}

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				counter++;
				// System.out.println("Este divizor" + i);

			}

		}
		System.out.println(counter);
		if (counter == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static int factorial(int n) {
		int produs = 1;

		if ((n == 0) || (n == 1)) {
			return 1;

		}
		for (int i = 2; i <= 2; i++) {
			produs = produs * i;

		}
		return produs;
	}
}
