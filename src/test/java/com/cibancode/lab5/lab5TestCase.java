/**
 * 
 */
package com.cibancode.lab5;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cibancode.patterndesign.lab4.supertypeimp.Grasnido;
import com.cibancode.patterndesign.lab5.Canario;

/**
 * @author edgar
 *
 */
public class lab5TestCase {

	public static final Logger logger = LoggerFactory.getLogger(lab5TestCase.class);
	@Test
	public void canarioTestCase(){
		Canario canario = new Canario();
		Assert.assertNotNull(canario);
		
		logger.debug("canario realizaVuelo");
		System.out.println("canario realizaVuelo");
		canario.realizaVuelo();
		logger.debug("canario realizaSonido");
		System.out.println("canario realizaSonido");
		canario.realizaSonido();
		System.out.println("canario cambiando sonido ave");
		canario.setTipoSonido(new Grasnido());
		System.out.println("canario realizaSonido");
		canario.realizaSonido();
	}
	
}
