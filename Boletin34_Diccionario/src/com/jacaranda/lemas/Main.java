package com.jacaranda.lemas;

import java.util.Scanner;

import com.jacaranda.lemas.Diccionario;
import com.jacaranda.lemas.DiccionarioException;
import com.jacaranda.lemas.LetraException;

public class Main {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws DiccionarioException, LetraException {

		// Declaracion del objeto
		Diccionario d1 = new Diccionario();

		// Declaracion de los atributos principales
		char opcion;
		String palabra;
		String significado;
		String cadena = null;

		// Presentacion a la aplicacion tratandola de hacer algo mas visual
		System.out.println("=====================================================================");
		System.out.println("=                                                                   =");
		System.out.println("=              BIENVENIDO A TU DICCIONARIO DE CONFIANZA             =");
		System.out.println("=                                                                   =");
		System.out.println("=                                                                   =");
		System.out.println("=                    ¿En que puedo ayudarle?                        =");
		System.out.println("=                                                                   =");
		System.out.println("=                   Elija la opcion que desee                       =");
		System.out.println("=====================================================================");
		System.out.println(menu());
		opcion = teclado.nextLine().charAt(0);

		// Declaracion del metodo while y el switch con los cuales va a funcionar y
		// vamos a movernos por el menu
		while (opcion != 5) {
			switch (opcion) {
			case '1': {
				System.out.println("Introduce la palabra ");
				palabra = teclado.nextLine();
				System.out.println("Introduce el significado ");
				significado = teclado.nextLine();
				d1.addPalabra(palabra, significado);
				break;
			}
			case '2': {
				System.out.println("Introduce la palabra");
				palabra = teclado.nextLine();
				System.out.println(d1.buscarPalabra(palabra));
				break;
			}
			case '3': {
				System.out.println("Introduce la palabra");
				palabra = teclado.nextLine();
				d1.borrarPalabra(palabra);
				break;
			}
			case '4': {
				System.out.println("Introduce la cadena");
				palabra = teclado.nextLine();
				System.out.println(d1.listadoPalabrasQueEmpiezanPor(palabra));
				break;

			}
			case 5: {
				System.out.println("Apagar y salir");
			}
			}
			System.out.println("Elija una opcion");
			System.out.println(menu());
			opcion = teclado.nextLine().charAt(0);
		}

	}

	// Declaracion del metodo para que sea mas comodo de llamar
	private static String menu() {
		return "1-.Anadir palabra\n" + "2-.Buscar palabra en diccionario\n" + "3-.Borrar una palabra del diccionario\n"
				+ "4-.Listado de palabras que empiecen por...\n" + "5-.Apagar y salir\n";
	}
}