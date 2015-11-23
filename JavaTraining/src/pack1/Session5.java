package pack1;

import pack1.Car.Engine;

public class Session5 {

	public static void main(String[] args) {

		String s = "abcd";
		String s2 = new String("abcd");
		String s3 = "aBcd";
		String a = "rares   @!@!@!   coste  alexandru";

		if (s == s3) {
			System.out.println("Equals");

		} else {
			System.out.println("NotEqual");
		}
		if (s.equals(s3)) {
			System.out.println("Equal");
		}
		if (s.equalsIgnoreCase(s3))

		{
			System.out.println("Equal s1");
		}
		// s = "ecd";
		s.length();
		System.out.println("lungimea" + s.length());

		s.concat(s3);
		s = s.concat(s3);
		System.out.println("dupa concatenare " + s);

		s = s.replace('a', 'X');
		System.out.println("inlocuire " + s);

		s3 = s3.toLowerCase();
		System.out.println("lower case " + s3);

		a = a.trim();
		System.out.println("No whitespace:< " + a + ">");

		StringBuilder sb = new StringBuilder();
		sb.append("rares");
		System.out.println(sb.toString());
		sb.append("coste");
		System.out.println(sb.toString());

		DeleteWhiteSpace();

		Car opel = new Car();
		opel.setEngine(Engine.BENZINA);
		Engine[] engines = Engine.values();

	}

	public static void DeleteWhiteSpace() {
		StringBuilder whitespace = new StringBuilder();
		String a = "aaaa bbbb  cccc dddd";

		int stringLength = a.length();

		for (int i = 0; i <= stringLength; i++) {
			if (a.charAt(i) != ' ') {
				whitespace.append(a.charAt(i));
			}
		}
		System.out.println("the value is <" + whitespace + ">");
	}

}
