package com.javachobo.renshuu;

public class Marine extends GroundUnit implements Healable {

	Marine() {
		super(50);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine";
	}
	
	
}
