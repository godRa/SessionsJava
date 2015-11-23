package session6;

public abstract class Mamifer {

	protected String nume; // protected se mostenesc si in subclase

	public Mamifer(String nume) { // un constructor care sa primeasca ca si
									// parametru numele
		this.nume = nume;
	}

	public abstract void vorbeste();

	public int legCount() {
		return Constante.NR_PICIOARE;

	}
}
