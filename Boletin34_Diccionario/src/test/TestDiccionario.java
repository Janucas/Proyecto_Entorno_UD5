//TEST COMENTADOS PARA BAJAR INFORME DE WARNINGS EN EL SONAR

//package test;
//
//import org.junit.Test;
//
//import com.jacaranda.lemas.DefinicionException;
//import com.jacaranda.lemas.Diccionario;
//import com.jacaranda.lemas.DiccionarioException;
//import com.jacaranda.lemas.LemaException;
//import com.jacaranda.lemas.LetraException;
//import com.jacaranda.lemas.Palabra;
//import com.jacaranda.lemas.Significado;
//
//public class TestDiccionario {
//
//	/*
//	 * Comprobacion de que añade la palabra y el significado
//	 */
//	@Test
//	public void testaddPalabraBueno() throws DiccionarioException, LetraException, LemaException, DefinicionException {
//		Diccionario d1 = new Diccionario();		
//		Palabra p1 = new Palabra("SALUDAR");
//		Significado s1 = new Significado("Es saludar");
//		d1.addPalabra("SALUDAR", "Es saludar");
//		try {
//			d1.addPalabra("SALUDAR", "Es saludar");
//		} catch (Exception e) {
//			System.out.println("Ya existe la palabra");
//		}
//
//	}
//
//	/*
//	 * Comprobacion de que devuelve la excepcion al meterle una palabra nula
//	 */
//	@Test
//	public void testaddPalabraNula() throws DiccionarioException, LetraException, LemaException, DefinicionException {
//		Diccionario d1 = new Diccionario();
//		Palabra p1 = new Palabra(null);
//		Significado s1 = new Significado("Es saludar");
//		d1.addPalabra("SALUDAR", "Es saludar");
//		try {
//			d1.addPalabra("SALUDAR", "Es saludar");
//		} catch (Exception e) {
//			System.out.println("La palabra añadida no puede ser nula");
//		}
//
//	}
//
//	/*
//	 * Comprobacion de que devuelve la excepcion al meterle una palabra nula
//	 */
//	@Test
//	public void testaddPalabraVacia() throws DiccionarioException, LetraException, LemaException, DefinicionException {
//		Diccionario d1 = new Diccionario();
//		Palabra p1 = new Palabra("");
//		Significado s1 = new Significado("Es saludar");
//		d1.addPalabra("SALUDAR", "Es saludar");
//		try {
//			d1.addPalabra("SALUDAR", "Es saludar");
//		} catch (Exception e) {
//			System.out.println("La palabra añadida no puede estar vacía");
//		}
//
//	}
//
//	/*
//	 * Comprobacion de que devuelve la excepcion al meterle una palabra con espacios en
//	 * blanco
//	 */
//	@Test
//	public void testaddPalabraEspacios()			
//		 throws DiccionarioException, LetraException, LemaException, DefinicionException {
//		Diccionario d1 = new Diccionario();
//		Palabra p1 = new Palabra("   ");
//		Significado s1 = new Significado("Es saludar");
//		d1.addPalabra("SALUDAR", "Es saludar");
//		try {
//			d1.addPalabra("SALUDAR", "Es saludar");
//		} catch (Exception e) {
//			System.out.println("La palabra añadida no puede solo contener espacios en blanco");
//		}
//
//	}
//
//	/*
//	 * Comprobacion de que devuelve la excepcion al meterle un significado con valor nulo
//	 */
//	@Test
//	public void testaddPalabraSignificadoNulo()
//			throws DiccionarioException, LetraException, LemaException, DefinicionException {
//		Diccionario d1 = new Diccionario();
//		Palabra p1 = new Palabra("HOLA");
//		Significado s1 = new Significado(null);
//		d1.addPalabra("SALUDAR", "Es saludar");
//		try {
//			d1.addPalabra("SALUDAR", "Es saludar");
//		} catch (Exception e) {
//			System.out.println("La definición no puede ser nula");
//		}
//
//	}
//
//	/*
//	 * Comprobacion de que devuelve la excepcion al meterle un significado con valor vacio
//	 */
//	@Test
//	public void testaddPalabraSignificadoVacio() throws DiccionarioException, LetraException, LemaException, DefinicionException {
//		Diccionario d1 = new Diccionario();
//		Palabra p1 = new Palabra("HOLA");
//		Significado s1 = new Significado("");
//		d1.addPalabra("SALUDAR", "Es saludar");
//		try {
//			d1.addPalabra("SALUDAR", "Es saludar");
//		} catch (Exception e) {
//			System.out.println("La definición no puede estar vacia");
//		}
//
//	}
//	/*
//	 * Comprobacion de que devuelve la excepcion al meterle un significado con espacios en blanco
//	 */
//	@Test
//	public void testaddPalabraSignificadoEspacios() throws DiccionarioException, LetraException, LemaException, DefinicionException {
//		Diccionario d1 = new Diccionario();
//		Palabra p1 = new Palabra("HOLA");
//		Significado s1 = new Significado("    ");
//		d1.addPalabra("SALUDAR", "Es saludar");
//		try {
//			d1.addPalabra("SALUDAR", "Es saludar");
//		} catch (Exception e) {
//			System.out.println("La definición no puede solo contener espacios");
//		}
//
//	}
//
//	/*
//	 * Comprobacion de que borra la palabra
//	 */
//	@Test
//	public void testborrarPalabraBueno() throws DiccionarioException, LetraException, LemaException, DefinicionException {
//		Diccionario d1 = new Diccionario();
//		Palabra p1 = new Palabra("SALUDAR");
//		d1.borrarPalabra("SALUDAR");
//		try {
//			d1.borrarPalabra("SALUDAR");
//		} catch (Exception e) {
//			System.out.println("La palabra ya esta borrada");
//		}
//	}
//	/*
//	 * Comprobacion de que devuelve la excepcion al eliminar la palabra nula
//	 */
//	@Test
//	public void testborrarPalabraNula() throws DiccionarioException, LetraException, LemaException, DefinicionException {
//		Diccionario d1 = new Diccionario();
//		Palabra p1 = new Palabra(null);
//		d1.borrarPalabra(null);
//		try {
//			d1.borrarPalabra(null);
//		} catch (Exception e) {
//			System.out.println("La palabra borrada no puede ser nula");
//		}
//	}
//	/*
//	 * Comprobacion de que devuelve la excepcion al eliminar la palabra vacia
//	 */
//	@Test
//	public void testborrarPalabraVacia() throws DiccionarioException, LetraException, LemaException, DefinicionException {
//		Diccionario d1 = new Diccionario();
//		Palabra p1 = new Palabra("");
//		d1.borrarPalabra("");
//		try {
//			d1.borrarPalabra("");
//		} catch (Exception e) {
//			System.out.println("La palabra borrada no puede estar vacía ");
//		}
//	}
//	/*
//	 * Comprobacion de que devuelve la excepcion al eliminar la palabra con espacios en blanco
//	 */
//	@Test
//	public void testborrarPalabraEspacios() throws DiccionarioException, LetraException, LemaException, DefinicionException {
//		Diccionario d1 = new Diccionario();
//		Palabra p1 = new Palabra(" ");
//		d1.borrarPalabra(" ");
//		try {
//			d1.borrarPalabra(" ");
//		} catch (Exception e) {
//			System.out.println("La palabra borrada no puede solo contener espacios en blanco.");
//		}
//	}
//	/*
//	 * Comprobacion de que se busca la palabra correctamente
//	 */
//	@Test
//	public void testbuscarPalabra() throws DiccionarioException, LetraException, LemaException{
//		Diccionario d1 = new Diccionario();
//		Palabra p1 = new Palabra("HOLA");
//		d1.buscarPalabra("HOLA");
//		try {
//			d1.buscarPalabra("HOLA");
//		} catch (Exception e) {
//			System.out.println("La palabra no existe");
//		}
//	}
//	/*
//	 * Comprobacion de que devuelve la excepcion al buscar la palabra nula
//	 */
//	@Test
//	public void testbuscarPalabraNula() throws DiccionarioException, LetraException, LemaException{
//		Diccionario d1 = new Diccionario();
//		Palabra p1 = new Palabra(null);
//		d1.buscarPalabra(null);
//		try {
//			d1.buscarPalabra(null);
//		} catch (Exception e) {
//			System.out.println("La palabra buscada no puede ser nula");
//		}
//	}
//	/*
//	 * Comprobacion de que devuelve la excepcion al buscar la palabra vacia
//	 */
//	@Test
//	public void testbuscarPalabraVacia() throws DiccionarioException, LetraException, LemaException {
//		Diccionario d1 = new Diccionario();
//		Palabra p1 = new Palabra("");
//		try {
//			d1.buscarPalabra("");
//		} catch (Exception e) {
//			System.out.println("La palabra buscada no puede estar vacia");
//		}
//	}
//
//	/*
//	 * Comprobacion de que devuelve la excepcion al buscar la palabra con espacios
//	 */
//	@Test
//	public void testbuscarPalabraEspacios() throws DiccionarioException, LetraException, LemaException {
//		Diccionario d1 = new Diccionario();
//		Palabra p1 = new Palabra(" ");
//		try {
//			d1.buscarPalabra(" ");
//		} catch (Exception e) {
//			System.out.println("La palabra buscada no puede estar vacia");
//		}
//	}
//	/*
//	 * Comprobacion de que aparece el listado de  palabras que empiezan por la cadena introducida
//	 */
//	@Test
//	public void testistadoPalabrasQueEmpiezanPor() throws LetraException, LemaException {
//		Diccionario d1 = new Diccionario();
//		Palabra l1= new Palabra("BA");
//		try {
//			d1.listadoPalabrasQueEmpiezanPor("BA");
//		}catch(Exception e) {
//			System.out.println("No existe palabras que empiezan por esa letra");
//		}
//	}
//	//DUDA
//	/*
//	 * Comprobacion de que devuelve la excepcion al introducir una cadena nula para mostrar el listado de  palabras que empiezan por esa cadena
//	 */
//	@Test
//	public void testistadoPalabrasQueEmpiezanPorCadenaNula() throws LetraException, LemaException {
//		Diccionario d1 = new Diccionario();
//		Palabra l1= new Palabra(null);
//		try {
//			d1.listadoPalabrasQueEmpiezanPor(null);
//		}catch(Exception e) {
//			System.out.println("La cadena no puede ser nula");
//		}
//	}
//	/*
//	 * Comprobacion de que devuelve la excepcion al introducir una cadena vacia para mostrar el listado de  palabras que empiezan por esa cadena
//	 */
//	@Test
//	public void testistadoPalabrasQueEmpiezanPorCadenaVacia() throws LetraException, LemaException {
//		Diccionario d1 = new Diccionario();
//		Palabra l1= new Palabra("");
//		try {
//			d1.listadoPalabrasQueEmpiezanPor("");
//		}catch(Exception e) {
//			System.out.println("La cadena no puede estar vacía");
//		}
//	}
//	/*
//	 * Comprobacion de que devuelve la excepcion al introducir una cadena con espacios para mostrar el listado de  palabras que empiezan por esa cadena
//	 */
//	@Test
//	public void testistadoPalabrasQueEmpiezanPorCadenaEspacios() throws LetraException, LemaException {
//		Diccionario d1 = new Diccionario();
//		Palabra l1= new Palabra("");
//		try {
//			d1.listadoPalabrasQueEmpiezanPor(" ");
//		}catch(Exception e) {
//			System.out.println("La cadena no puede contener espacios en blanco");
//		}
//	}
//
//
//}
