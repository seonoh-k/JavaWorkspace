package com.javachobo.renshuu;

public class Tank extends GroundUnit implements Repairable {

	Tank() {
		super(200);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank";
	}
	
}
