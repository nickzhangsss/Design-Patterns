package org.zxlstudios.designpatterns.strategy;

public class Mage extends Character {

	public Mage() {
		attack = new Organic();
		defend = new Armor();
	}

}
