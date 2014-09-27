/**
 * 
 */
package com.cibancode.patterndesign.lab4.supertypeimp;

import com.cibancode.patterndesign.lab4.supertype.TipoVuelo;

/**
 * @author edgar
 *Esta clase especifica el vuelo de un ave
 */
public class VueloConAlas implements TipoVuelo {

	/* (non-Javadoc)
	 * @see com.cibancode.patterndesign.lab4.supertype.TipoVuelo#vuelo()
	 * 
	 */
	public void vuelo() {
		System.out.println("Esta volando, aleteando");

	}

}
