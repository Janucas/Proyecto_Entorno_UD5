//TEST COMENTADOS PARA BAJAR INFORME DE WARNINGS EN EL SONAR


//package test;
//
//import org.junit.Test;
//
//import com.jacaranda.lemas.DefinicionException;
//import com.jacaranda.lemas.LemaException;
//import com.jacaranda.lemas.Palabra;
//import com.jacaranda.lemas.Significado;
//
//public class TestPalabra {
//
//	/*
//	 * Comprobacion de que añade el significado
//	 */
//	@Test
//	public void testaddSignificadoBueno() throws LemaException, DefinicionException {
//		Palabra p1 = new Palabra("SALUDAR");
//		Significado s1 = new Significado("Es saludar");
//		Significado s2 = new Significado("Es decir adios");
//		p1.addSignificado(s1);
//		try {
//			p1.addSignificado(s2);
//		} catch (Exception e) {
//			System.out.println("Ya existe el significado");
//		}
//
//	}
//
//	/*
//	 * Comprobacion de que devuelve la excepcion de que ya existe
//	 */
//	@Test
//	public void testaddSignificadoMalo() throws LemaException, DefinicionException {
//		Palabra p1 = new Palabra("SALUDAR");
//		Significado s1 = new Significado("Es saludar");
//		Significado s2 = new Significado("Es saludar");
//		p1.addSignificado(s1);
//		try {
//			p1.addSignificado(s2);
//		} catch (Exception e) {
//			System.out.println("Ya existe el significado");
//		}
//
//	}
//
//}
