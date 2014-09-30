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
public class Canto implements TipoSonido {

	public static final Logger logger = LoggerFactory.getLogger(Canto.class);
	
	public void makeSound() {
		logger.debug("estoy cantando");
		System.out.println("estoy cantando");
		
	}

}
