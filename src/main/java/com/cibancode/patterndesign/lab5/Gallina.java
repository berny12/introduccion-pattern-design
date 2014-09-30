/**
 * 
 */
package com.cibancode.patterndesign.lab5;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cibancode.patterndesign.lab4.supertypeimp.Grasnido;
import com.cibancode.patterndesign.lab4.supertypeimp.VueloConAlas;

/**
 * @author edgar
 *
 */
public class Gallina extends Ave {

	public static final Logger logger = LoggerFactory.getLogger(Gallina.class);
	
		public Gallina(){
			logger.debug("instnaciando una gallina");
			this.setTipoSonido( new Grasnido());
			this.setTipoVuelo( new VueloConAlas());
		}
}
