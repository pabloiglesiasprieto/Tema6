package ejercicio5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Constante de la ruta del fichero
		final String FICHERO_ROOT = "src\\ejercicio5\\datos.txt";

		// Declaramos una variable que almacenará el nombre.
		String nombre;

		// Declaramos una variable que almacenará la edad.
		int edad;

		// Declaramos una variable que almacenará la linea a añadir al fichero.
		String linea = "";

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un BufferedWriter.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FICHERO_ROOT, true))) {

			// Preguntamos el nombre de la persona.
			System.out.println("Introduce el nombre de la persona.");

			// Leemos entrada de teclado.
			nombre = sc.nextLine();

			// Preguntamos la edad de la persona.
			System.out.println("Introduce la edad de la persona.");

			// Leemos entrada de teclado.
			edad = sc.nextInt();

			// Añadimos los datos a la linea.
			linea += "Nombre: " + nombre + " |" + " Edad : " + String.valueOf(edad) + " años.";

			// Añadimos la linea al fichero.
			bw.write(linea);

			// Añadimos una linea.
			bw.newLine();

			// Limpiamos el buffer.
			bw.flush();

			// Cerramos el bw.
			bw.close();

			// Cerramos el Scanner.
			sc.close();

			// Cogemos la excepción del bw.
		} catch (IOException e) {

			// Imprimimos el error.
			System.out.println("Error: " + e.getMessage());
		}
		// Le decimos al usuario que mire el fichero.
		System.out.println("Fin, mira el fichero.");
	}
}
