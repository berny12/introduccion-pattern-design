/**
 * 
 */
package com.cibancode.patterndesign.lab2;

/**
 * @author edgar
 *
 */
public class AvesTruz extends Ave {

	/* (non-Javadoc)
	 * @see com.cibancode.patterndesign.lab1.Ave#makeSound()
	 */
	@Override
	public void makeSound() {
		System.out.println("<<Silencio>>");

	}

	public void vuela(){
		System.out.println("no vuela");
	}
}
