/**
 * 
 */
package com.cibancode.lab4;



import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cibancode.patterndesign.lab4.Avestruz;
import com.cibancode.patterndesign.lab4.Canario;
import com.cibancode.patterndesign.lab4.Gallina;

/**
 * @author edgar
 *
 */
public class lab4TestCase {

	public static final Logger logger = LoggerFactory.getLogger(lab4TestCase.class);
	
	@Test
	public void avestruzTest() {
		
		Avestruz avestruz = new Avestruz();
		Assert.assertNotNull(avestruz);
		logger.debug("avestruz realizaVuelo");
		System.out.println("avestruz realizaVuelo");
		avestruz.realizaVuelo();
		logger.debug("avestruz realizaSonido");
		System.out.println("avestruz realizaSonido");
		avestruz.realizaSonido();
		
	}
	@Test
	public void canarioTest() {
		
		Canario canario = new Canario();
		Assert.assertNotNull(canario);
		
		logger.debug("canario realizaVuelo");
		System.out.println("canario realizaVuelo");
		canario.realizaVuelo();
		logger.debug("canario realizaSonido");
		System.out.println("canario realizaSonido");
		canario.realizaSonido();
		
	}
	@Test
	public void gallinaTest() {
		
		Gallina gallina = new Gallina();
		Assert.assertNotNull(gallina);
		
		logger.debug("gallina realizaVuelo");
		System.out.println("gallina realizaVuelo");
		gallina.realizaVuelo();
		logger.debug("gallina realizaSonido");
		System.out.println("gallina realizaSonido");
		gallina.realizaSonido();
		
	}

}
