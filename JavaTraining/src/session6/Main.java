package session6;

public class Main {

	public static void main(String[] args) {

		Mamifer pisica = new Pisica("Tom");
		Vaca vaca = new Vaca();
		Mamifer vaca2 = new Vaca();

		pisica.vorbeste();
		vaca.vorbeste();

		System.out.println("Nr picioar: " + pisica.legCount());
		System.out.println("Nr picioar: " + vaca.legCount());

		vaca.printUrechi();
		((Vaca) vaca2).printUrechi();

		((Trickster) pisica).playDead(); // cast - convertit explicit un mamifer
											// in trickster

		Pisica pisica2 = new Pisica("Ken");
		pisica2.walkOnTwoLegs();

		Trickster pisica3 = new Pisica("Matza");
		pisica3.walkOnTwoLegs();

		((Mamifer) vaca).legCount();

		Pisica pisica4 = new Pisica("Lulu");
		pisica4.toarce(5);
		// unboxing
		int doi = new Integer(2);
		int trei = 3;
		Integer patru = new Integer(4);
		// autoboxing
		int paatru = patru;

	}

}
