package ejercicio7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Creamos una variable que almacenará el nombre.
		String nombre;

		// Creamos una variable que almacenará el telefono.
		int telefono;

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

					// Guardamos la info en una linea.
					linea += "Nombre: " + nombre + " " + "Telefono: " + Integer.toString(telefono);

					// Añadimos la linea al fichero.
					bw.write(linea);

					// Añadimos una nueva linea.
					bw.newLine();

					// Limpiamos el buffer.
					bw.flush();
				}
				// Segundo case.
				case 2 -> {
					
					// Creamos un flujo.
					BufferedReader br = new 

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
