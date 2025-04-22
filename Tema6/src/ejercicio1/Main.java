package ejercicio1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Inicializamos la suma a 0.
		int suma = 0;

		// Declaramos la media.
		int media;

		// Declaramos el número que recibirá del flujo.
		int numero;

		// Declaramos un contador de números del flujo.
		int contador = 0;

		// Creamos un try.
		try (Scanner sc = new Scanner(new FileReader("src\\ejercicio1\\NumerosReales.txt"))) {

			// Creamos un while hasta que hayamos recorrido todos los números enteros.
			while (sc.hasNextInt()) {

				// Asignamos al número el primer número del flujo.
				numero = sc.nextInt();

				// Añadimos el número a la suma.
				suma += numero;

				// Aumentamos el contador.
				contador++;
			}
			// Calculamos la media.
			media = suma / contador;

			// Imprimimos la suma y media.
			System.out.println("La suma es de: " + suma);
			System.out.println("La media es de: " + media);

			// Cogemos la excepción de no encontrar el archivo.
		} catch (FileNotFoundException e) {

			// Imprimimos un error.
			System.out.println("El fichero no se ha encontrado: " + e.getMessage());
		}

	}
}
