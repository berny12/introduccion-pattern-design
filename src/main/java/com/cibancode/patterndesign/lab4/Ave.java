/**
 * 
 */
package com.cibancode.patterndesign.lab4;

import com.cibancode.patterndesign.lab4.supertype.TipoSonido;
import com.cibancode.patterndesign.lab4.supertype.TipoVuelo;

/**
 * @author edgar
 *
 */
public abstract class Ave {

		TipoSonido tipoSonido;
		TipoVuelo tipoVuelo;
		
		//metodos de una ave
		
		public void realizaVuelo(){
			tipoVuelo.vuelo();
		}
	
		public void realizaSonido(){
			tipoSonido.makeSound();
		}
}
