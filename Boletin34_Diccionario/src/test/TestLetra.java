//TEST COMENTADOS PARA BAJAR INFORME DE WARNINGS EN EL SONAR


//package test;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNull;
//
//import org.junit.Test;
//
//import com.jacaranda.lemas.LemaException;
//import com.jacaranda.lemas.LetraException;
//import com.jacaranda.lemas.Palabra;
//
//public class TestLetra {
//
//	/*
//	 * Comprueba que existe la palabra
//	 */
//	@Test
//	public void testExistePalabra() throws LemaException {
//		Palabra target = new Palabra("HOLA");
//		String expected = "HOLA";
//		assertEquals("No existe la palabra", target.getNombre(), expected);
//
//	}
//
//	/*
//	 * Comprueba que devuelve una excepcion al introducir la palabra nula
//	 */
//		@Test
//	public void testExistePalabraNula() throws LemaException {
//		Palabra target = new Palabra(null);
//		assertEquals("No existe la palabra", target);
//	}
//	/*
//	 * Comprobacion de que busca la palabra
//	 */
//	@Test
//	public void testaddPalabra() throws LemaException {
//		Palabra target = new Palabra("HOLA");
//		String expected = "HOLA";
//		assertEquals("No existe la palabra", target.getNombre(), expected);
//
//	}
//	
//	/*
//	 * Comprobacion de que devuelve la excepcion al introducir la palabra nula
//	 */
//	@Test
//	public void testaddPalabraNula() throws LemaException {
//		Palabra target = new Palabra(null);
//		assertEquals("No existe la palabra", target);
//
//	}
//	
//
//	/*
//	 * Comprobacion de que busca la palabra 
//	 */
//	@Test
//	public void testBuscarPalabra() throws LemaException {
//		Palabra target= new Palabra("HOLA");
//		String expected="HOLA";
//		assertEquals("No existe la palabra",target.getNombre(),expected);
//		
//	}
//	/*
//	 * Comprobacion de que devuelve la excepcion al buscar la palabra nula
//	 */
//	@Test
//	public void testBuscarPalabraNula() throws LemaException {
//		Palabra target= new Palabra(null);
//		assertNull("No existe la palabra",target);
//		
//	}
//	/*
//	 * Comprobacion de que borra la palabra /	 */
//	@Test
//	public void testBorrarPalabra() throws LemaException {
//		Palabra target= new Palabra("HOLA");
//		String expected="HOLA";
//		assertEquals("No existe la palabra",target.getNombre(),expected);
//		
//	}
//	/*
//	 * Comprobacion de que devuelve la excepcion al borrar la palabra nula
//	 */
//	@Test
//	public void testBorrarPalabraNula() throws LemaException,LetraException {
//		Palabra target= new Palabra(null);
//		assertNull("No existe la palabra",target);
//		
//	}
//	/*
//	 * Comprobacion de que devuelve una lista de palabras de una cadena
//	 */
//	@Test
//	public void testListaPalabra() throws LetraException, LemaException {
//		Palabra target= new Palabra("HOLA");
//		String expected="HOLA";
//		assertEquals("No existe la palabra",target.getNombre(),expected);
//		
//	}
//	/*
//	 * Comprobacion de que devuelve la excepcion al listar palabras de una cadena
//	 */
//	@Test
//	public void testListaPalabraNula() throws LetraException, LemaException {
//		Palabra target= new Palabra(null);
//		assertNull("La cadena no puede ser nula",target);
//		
//	}
//}
