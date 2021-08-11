package com.machinarium.model.Item.part;

public class Body extends Part {
	private final int aeroDrag;

	public Body(int uid, String name, int weight, int aeroDrag) {
		super(uid, name, weight);
		this.aeroDrag = aeroDrag;
	}


	public int getAeroDrag() {
		return aeroDrag;
	}

	@Override
	public String toString() {
		String str = super.toString();
		str += "[aeroDrag: " + aeroDrag + "] \n";
		return str;
	}

}
