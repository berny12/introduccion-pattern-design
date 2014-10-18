/**
 * 
 */
package com.cibancode.patterndesign.lab3;



/**
 * @author edgar
 *
 */
//la aveztruz no vuela no es necesario implementar la interfaz vuelo
public class AvesTruz extends Ave {

	/* (non-Javadoc)
	 * @see com.cibancode.patterndesign.lab1.Ave#makeSound()
	 */
	@Override
	public void makeSound() {
		System.out.println("<<Silencio>>");

	}

	
}
