package Colectii;

import java.util.Random;

public class RandomNumber implements Comparable<RandomNumber> {
	private int nr;
	private static Random random = new Random();

	RandomNumber(int max) { // constructor
		nr = random.nextInt(max);
	}

	int getNr() {
		return nr;
	}

	@Override
	public String toString() {
		return "" + nr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nr;
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RandomNumber other = (RandomNumber) obj;
		if (nr != other.nr)
			return false;
		return true;
	}

	@Override
	public int compareTo(RandomNumber o) {
		if (nr == o.nr) {
			return 0;
		} else if (nr < o.nr) {
			return -1;
		} else {
			return 1;
		}
	}

}
