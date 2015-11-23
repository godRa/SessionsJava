package session6;

public class Vaca extends Mamifer {
	public static int NR_Urechi = 2;

	@Override
	public void vorbeste() {
		System.out.println("Muu");

	}

	public Vaca() {
		super("Cow");
		NR_Urechi++;
	}

	public void printUrechi() {
		System.out.println(NR_Urechi);
	}

}
