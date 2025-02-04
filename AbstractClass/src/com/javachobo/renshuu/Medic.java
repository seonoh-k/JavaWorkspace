package com.javachobo.renshuu;

public class Medic extends GroundUnit implements Healable {

	Medic() {
		super(50);
		hitPoint = MAX_HP;
	}
	
	void heal(Healable h) {
		if(h instanceof Unit) {
			Unit u = (Unit)h;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
				System.out.println(u + " ġ�� " + u.hitPoint);
			}
			System.out.println(u + " ġ�� �Ϸ�");
		}
	}

	@Override
	public String toString() {
		return "Medic";
	}
	
	
}
