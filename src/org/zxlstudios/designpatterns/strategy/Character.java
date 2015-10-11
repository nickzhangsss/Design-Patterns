package org.zxlstudios.designpatterns.strategy;

public abstract class Character {
	Attack attack;
	Defend defend;
	
	public void attack() {
		attack.attack();
	}
	
	public void defend() {
		defend.defend();
	}
}
