/**
 * 
 */
package com.cibancode.patterndesign.lab5;

import com.cibancode.patterndesign.lab4.supertype.TipoSonido;
import com.cibancode.patterndesign.lab4.supertype.TipoVuelo;

/**
 * @author edgar
 *
 */
public abstract class Ave {

		 private TipoSonido tipoSonido;
		 private TipoVuelo tipoVuelo;
		
		//metodos de una ave
		
	

		public void setTipoSonido(TipoSonido tipoSonido) {
			this.tipoSonido = tipoSonido;
		}

		public void setTipoVuelo(TipoVuelo tipoVuelo) {
			this.tipoVuelo = tipoVuelo;
		}

		public void realizaVuelo(){
			tipoVuelo.vuelo();
		}
	
		public void realizaSonido(){
			tipoSonido.makeSound();
		}
}
