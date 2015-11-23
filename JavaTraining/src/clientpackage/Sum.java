package clientpackage;


public class Sum {
	
	//suma a doua numere
	public int sum(int a, int b) {

		return a + b;

	}

	// suma a "n" numere
	public int sum1(int n) {

		int s = 0;
		for (int i = 0; i <= n; i++) {
			s = s + i;

		}
		return s;
	}

	// produsul a doua numere
	public int produs(int n) {

		int p = 1;
		for (int i = 1; i <= n; i++) {
			p = p * i;

		}
		return p;

	}
}
