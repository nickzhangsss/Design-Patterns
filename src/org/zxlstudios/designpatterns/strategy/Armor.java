package org.zxlstudios.designpatterns.strategy;

public class Armor implements Defend {

	@Override
	public void defend() {
		System.out.println("Sheild");
	}

}
