/**
 * 
 */
package com.cibancode.patterndesign.lab4.supertypeimp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	
	public static final Logger logger =LoggerFactory.getLogger(VueloConAlas.class);
	
	public void vuelo() {
		logger.debug("Esta volando, aleteando");
		System.out.println("Esta volando, aleteando");

	}

}
