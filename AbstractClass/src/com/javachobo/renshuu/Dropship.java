package com.javachobo.renshuu;

public class Dropship extends AirUnit implements Repairable {

	Dropship() {
		super(100);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Dropship";
	}
}
