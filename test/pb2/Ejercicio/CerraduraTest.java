package pb2.Ejercicio;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class CerraduraTest {

	private Cerradura cerradura;
	
	@Test
	public void queSePuedaCrearUnaCerraduraYEsteCerrada() {
		
		Assert.assertFalse(cerradura.getEstadoApertura());
		/*
		Integer clave1=123456;
		Integer clave2=654321;
		Integer clave3=123654;
		
		Cerradura cerradura1 = new Cerradura (clave1);
		Cerradura cerradura2 = new Cerradura (clave2);
		Cerradura cerradura3 = new Cerradura (clave3);
		
		assertNotNull(cerradura1);
		assertNotNull(cerradura2);
		assertNotNull(cerradura3);
		*/
	}
	
	@Test
	public void noPoderAbrirCerraduraConCodigoErroneo() {
		Integer codigoErroneo=1111;
		Assert.assertFalse(cerradura.abrir(codigoErroneo));
	}
	
	@Test
	public void queSeCierreUnaCerraduraConUnaClave () {
		
	}
	
	
	
	
	
}



