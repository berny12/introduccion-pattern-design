package com.cibancode.lab1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.cibancode.patterndesign.lab1.AvesTruz;
import com.cibancode.patterndesign.lab1.Canario;
import com.cibancode.patterndesign.lab1.Gallina;

public class lab1TestCase {

	@Test
	public void baseAvesTRuzTestCase() {
		
		AvesTruz aveztruz = new AvesTruz();
		Assert.assertNotNull(aveztruz);
		System.out.println("Avestruz haciendo sonido");
		aveztruz.makeSound();
	}

	@Test
	public void baseCanarioTestCase() {
			
		Canario canario = new Canario();
		System.out.println("Canario haciendo sonido");
		canario.makeSound();
	}
	@Test
	public void baseGallinaTestCase() {
			
		Gallina gallina = new Gallina();
		System.out.println("Gallina haciendo sonido");
		gallina.makeSound();
	}
}
