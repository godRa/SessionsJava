package session6;

public final class Pisica extends Mamifer implements Trickster {

	@Override
	public void vorbeste() {
		System.out.println("Miau");

	}

	public Pisica(String nume) {
		super("Pisica");
	}

	@Override
	public int legCount() {
		return super.legCount() + 1;

	}

	@Override
	public void playDead() {
		System.out.println("Playing Dead");
	}

	@Override
	public void walkOnTwoLegs() {
		System.out.println("Walking on two legs");
	}

	public void toarce(final int nrMinute) { // int nrMinute -param pt metoda
		// nrMinute = 8;
		System.out.println("A tors" + nrMinute);
	}

}
