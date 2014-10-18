/**
 * 
 */
package com.cibancode.patterndesign.lab3;

import com.cibancode.patterndesign.lab3.interfaces.Volar;

/**
 * @author edgar
 *
 */
public class Gallina extends Ave implements Volar {

	/* (non-Javadoc)
	 * @see com.cibancode.patterndesign.lab1.Ave#makeSound()
	 */
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Grasna");
	}
	public void vuela(){
		System.out.println("vuela con alas");
	}

}
