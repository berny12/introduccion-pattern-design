/**
 * 
 */
package com.cibancode.patterndesign.lab4.supertypeimp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cibancode.patterndesign.lab4.supertype.TipoSonido;

/**
 * @author edgar
 *
 */
public class Grasnido implements TipoSonido {

	/* (non-Javadoc)
	 * @see com.cibancode.patterndesign.lab4.supertype.TipoSonido#makeSound()
	 */
	public static final Logger logger = LoggerFactory.getLogger(Grasnido.class);
	
	public void makeSound() {
		logger.debug("grasnando");
		System.out.println("grasnando");

	}

}
