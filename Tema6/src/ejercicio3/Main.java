package ejercicio3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Declaramos la variable que almacenará los nombres.
		String nombre;

		// Declaramos la variable que almacenará la media.
		int media;

		// Declaramos la variable que almacenará la suma.
		int suma = 0;

		// Declaramos la variable que almacenará la linea.
		String linea;

		// Declaramos un array de String que almacenará la linea del fichero dividida.
		String[] data;

		// Creamos un flujo.
		try (Scanner sc = new Scanner(new FileReader("src\\ejercicio3\\Alumnos.txt"))) {

			// Guardamos la linea.
			linea = sc.nextLine();

			// Creamos un bucle que recorrerá las lineas del fichero hasta que no haya más.
			while (linea != null) {

				// Guardamos en data los datos del fichero.
				data = linea.split(" ");

				// Imprimimos la información.
				System.out.println("Nombre: " + Integer.parseInt(data[0]) + "Estatura: " + Double.parse);

			}
			// Cogemos la excepción.
		} catch (FileNotFoundException e) {

			// Imprimimos el mensaje de error.
			System.out.println("El fichero no se ha encontrado: " + e.getMessage());
		}
	}
}
