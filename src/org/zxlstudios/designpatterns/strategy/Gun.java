package org.zxlstudios.designpatterns.strategy;

public class Gun implements Attack {

	@Override
	public void attack() {
		System.out.println("AK47");
	}

}
