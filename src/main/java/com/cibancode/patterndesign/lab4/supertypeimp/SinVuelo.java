/**
 * 
 */
package com.cibancode.patterndesign.lab4.supertypeimp;

import com.cibancode.patterndesign.lab4.supertype.TipoVuelo;

/**
 * @author edgar
 *
 */
public class SinVuelo implements TipoVuelo {

	/* (non-Javadoc)
	 * @see com.cibancode.patterndesign.lab4.supertype.TipoVuelo#vuelo()
	 */
	public void vuelo() {
		System.out.println("no puedo volar");
	}

}
