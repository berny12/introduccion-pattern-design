/**
 * 
 */
package com.cibancode.patterndesign.lab4.supertypeimp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cibancode.patterndesign.lab4.supertype.TipoVuelo;

/**
 * @author edgar
 *
 */
public class SinVuelo implements TipoVuelo {

	/* (non-Javadoc)
	 * @see com.cibancode.patterndesign.lab4.supertype.TipoVuelo#vuelo()
	 */
	
	public static final Logger logger = LoggerFactory.getLogger(SinVuelo.class);
	
	public void vuelo() {
		logger.debug("no puedo volar");
		System.out.println("no puedo volar");
	}

}
