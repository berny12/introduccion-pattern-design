/**
 * 
 */
package com.cibancode.patterndesign.lab2;

/**
 * @author edgar
 *
 */
public class Canario extends Ave {

	/* (non-Javadoc)
	 * @see com.cibancode.patterndesign.lab1.Ave#makeSound()
	 */
	@Override
	public void makeSound() {
		System.out.println("Canta");

	}
	public void vuela(){
		System.out.println("vuela con alas");
	}

}
