package org.zxlstudios.designpatterns.strategy;

public class Run {

	public static void main(String[] args) {
		Character c = new Mage();
		c.attack();
		c.defend();
		c = new Marine();
		c.attack();
		c.defend();
	}

}
