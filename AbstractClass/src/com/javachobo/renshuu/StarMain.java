package com.javachobo.renshuu;

public class StarMain {

	public static void main(String[] args) {

		Marine mr = new Marine();
		SCV scv = new SCV();
		Tank tk = new Tank();
		Dropship ds = new Dropship();
		Medic md = new Medic();
		
		scv.repair(tk);
		scv.repair(ds);
		//scv.repair(mr);
		
		tk.hitPoint = 196;
		scv.repair(tk);
		
		md.heal(mr);
		md.heal(md);
		
		mr.hitPoint = 47;
		md.heal(mr);
	}

}
