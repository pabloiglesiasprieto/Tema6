package ejercicio2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Creamos la variable que almacenará la suma.
		int suma = 0;

		// Creamos la variable que almacenará la media.
		int media;

		// Creamos la variable que almacenará el número.
		int numero;

		// Creamos la variable que almacenará el contador.
		int contador = 0;

		// Creamos un flujo.
		try (Scanner sc = new Scanner(new FileReader("src\\ejercicio2\\Enteros.txt"))) {

			// Creamos un while que recorrerá los números.
			while (sc.hasNextInt()) {

				// Leemos el primer número del fichero.
				numero = sc.nextInt();

				// Aumentamos la suma.
				suma += numero;

				// Aumentamos el contador.
				contador++;
			}

			// Calculamos la media.
			media = suma / contador;

			// Imprimimos la suma.
			System.out.println("La suma es de: " + suma);

			// Imprimimos la media.
			System.out.println("La media es de: " + media);

		} catch (FileNotFoundException e) {

			// Imprimimos que el fichero no se ha encontrado.
			System.out.println("El fichero no se ha encontrado.");
		}

	}
}
