package com.cibancode.lab2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.cibancode.patterndesign.lab2.AvesTruz;
import com.cibancode.patterndesign.lab2.Canario;
import com.cibancode.patterndesign.lab2.Gallina;

public class lab2TestCase {

	@Test
	public void baseAvesTRuzTestCase() {
		
		AvesTruz aveztruz = new AvesTruz();
		Assert.assertNotNull(aveztruz);
		System.out.println("Avestruz haciendo sonido");
		aveztruz.makeSound();
		System.out.println("Avestruz haciendo vuelo");
		aveztruz.vuela();
	}

	@Test
	public void baseCanarioTestCase() {
			
		Canario canario = new Canario();
		System.out.println("Canario haciendo sonido");
		canario.makeSound();
		System.out.println("Canario haciendo vuelo");
		canario.vuela();
	}
	@Test
	public void baseGallinaTestCase() {
			
		Gallina gallina = new Gallina();
		System.out.println("Gallina haciendo sonido");
		gallina.makeSound();
		System.out.println("Gallina haciendo vuelo");
		gallina.vuela();
	}
}
