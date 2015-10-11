package org.zxlstudios.designpatterns.strategy;

public class Bomb implements Attack {

	@Override
	public void attack() {
		System.out.println("Atomic Bomb");
	}

}
