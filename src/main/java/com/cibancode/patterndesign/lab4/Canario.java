/**
 * 
 */
package com.cibancode.patterndesign.lab4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cibancode.patterndesign.lab4.supertypeimp.VueloConAlas;
import com.cibancode.patterndesign.lab4.supertypeimp.Canto;

/**
 * @author edgar
 *
 */
public class Canario extends Ave{

	public static final Logger logger = LoggerFactory.getLogger(Canario.class);
	
	public Canario(){
	logger.debug("instanciando un canario");
	tipoSonido = new Canto();
	tipoVuelo = new VueloConAlas();
	}
}
