/**
 * 
 */
package com.cibancode.patterndesign.lab3;

import com.cibancode.patterndesign.lab3.interfaces.Volar;

/**
 * @author edgar
 *
 */
public class Canario extends Ave  implements Volar{

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
