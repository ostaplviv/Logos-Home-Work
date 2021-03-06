package work11;

import work11.enumPack.Diameter;

public class Wheel {
	private Diameter diameter;

	public Wheel(Diameter diameter) {
		this.diameter = diameter;
	}

	public Diameter getDiameter() {
		return diameter;
	}

	public void setDiameter(Diameter diameter) {
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "Wheel diameter= " + diameter;
	}

}
