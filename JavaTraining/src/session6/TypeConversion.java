package session6;

public class TypeConversion {

	public static void main(String[] args) {
		// narrowing conversion
		int oneInt = 129;
		byte oneByte = (byte) oneInt;
		System.out.println("One Byte" + oneByte);

		// widening conversion
		long oneLong = oneByte;
		System.out.println("One Long" + oneLong);

		float oneFloat = 0.1f;
		float pi = 3.14f;
		int onePi = (int) pi;
		System.out.println("One PI: " + onePi);

		double oneDouble = pi;
		System.out.println("One Double: " + oneDouble);

		double twoDouble = 15200.35d;
		byte twoByte = (byte) twoDouble;
		System.out.println("Two Byte " + twoByte);

	}

}
