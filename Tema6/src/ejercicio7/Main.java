package ejercicio7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Creamos un HashMap.
		HashMap<String, Integer> mapa = new HashMap<String, Integer>();

		// Creamos una variable que almacenará el nombre.
		String nombre;

		// Creamos una variable que almacenará el telefono.
		Integer telefono;

		// Declaramos la variable que almacenará la elección del usuario.
		char eleccion;

		// Declaramos la variable que almacenará la linea.
		String linea = "";

		// Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un BufferedWriter.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ejercicio7\\datosTelefonicos.txt"))) {

			// Imprimimos el menú.
			System.out.println("Que acción quieres realizar:\n1. Nuevo contacto.\r\n" + "2. Buscar por nombre.\r\n"
					+ "3. Mostrar todos.\r\n" + "0. Salir.\r\n" + "");

			// Guardamos la elección en la variable.
			eleccion = sc.next().charAt(0);

			// Creamos un while.
			while (eleccion != 0) {

				// Creamos un switch de la elección.
				switch (eleccion) {

				// Primer case.
				case 1 -> {

					// Vaciamos la linea.
					linea = "";

					// Preguntamos el nombre.
					System.out.println("Introduce el nombre:");

					// Leemos entrada de teclado.
					nombre = sc.nextLine();

					// Preguntamos el telefono.
					System.out.println("Introduce el telefono del usuario.");

					// Leemos entrada de teclado.
					telefono = sc.nextInt();

					// Limpiamos Scanner.
					sc.nextLine();

					// Añadimos los datos al mapa.
					mapa.put(nombre, telefono);
				}
				// Segundo case.
				case 2 -> {

					// Creamos un flujo.
					try (BufferedReader br = new BufferedReader(
							new FileReader("src\\ejercicio8\\datosTelefonicos.txt"))) {

						// Cogemos la excepción.
					} catch (IOException ioe) {

						// Lanzamos la excepción.
						System.out.println("El archivo no existe: " + ioe.getMessage());

						// Creamos el archivo.
						FileWriter fw = new FileWriter("src\\ejercicio8\\datosTelefonicos.txt");

						// Cerramos el File Writer.
						fw.close();
					}
				}
				// Tercer case.
				case 3 -> {

				}
				}
			}

			// Recogemos la excepción.
		} catch (IOException e) {

			// Imprimimos la excepción.
			System.out.println("El fichero no se ha podido escribir: " + e.getMessage());
		}
	
	}
}
