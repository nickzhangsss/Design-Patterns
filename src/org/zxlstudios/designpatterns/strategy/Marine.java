package org.zxlstudios.designpatterns.strategy;

public class Marine extends Character {

	public Marine() {
		attack = new Gun();
		defend = new Armor();
	}
	
}
