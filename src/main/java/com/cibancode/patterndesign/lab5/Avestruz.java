/**
 * 
 */
package com.cibancode.patterndesign.lab5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cibancode.patterndesign.lab4.supertypeimp.SinCanto;
import com.cibancode.patterndesign.lab4.supertypeimp.SinVuelo;

/**
 * @author edgar
 *
 */
public class Avestruz extends Ave {

	public static final Logger logger = LoggerFactory.getLogger(Avestruz.class);
	
	public Avestruz (){
		logger.debug("instanciando aveztruz");
		this.setTipoSonido( new SinCanto());
		this.setTipoVuelo(new SinVuelo());
	}
	
}
