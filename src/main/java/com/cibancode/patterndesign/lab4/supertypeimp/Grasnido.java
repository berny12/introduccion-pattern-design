/**
 * 
 */
package com.cibancode.patterndesign.lab4.supertypeimp;

import com.cibancode.patterndesign.lab4.supertype.TipoSonido;

/**
 * @author edgar
 *
 */
public class Grasnido implements TipoSonido {

	/* (non-Javadoc)
	 * @see com.cibancode.patterndesign.lab4.supertype.TipoSonido#makeSound()
	 */
	public void makeSound() {
		System.out.println("grasnando");

	}

}
