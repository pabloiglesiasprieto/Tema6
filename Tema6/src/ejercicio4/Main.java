package ejercicio4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Creamos la variable que almacenará la cadena.
		String cadena;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un BufferWriter.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ejercicio4\\Lineas.txt", true))) {

			// Le preguntamos al usuario si quiere añadir algo al fichero.
			System.out.println("Que quieres añadir al fichero.");

			// Leemos entrada de teclado.
			cadena = sc.nextLine();

			// Creamos un while para comprobar que el usuario ha añadido "fin".
			while (!cadena.equalsIgnoreCase("fin")) {

				// Escribimos la cadena.
				bw.write(cadena);

				// Añadimos una linea nueva.
				bw.newLine();

				// Le preguntamos al usuario si quiere añadir algo al fichero.
				System.out.println("Que quieres añadir al fichero.");

				// Leemos entrada de teclado.
				cadena = sc.nextLine();
			}

			// Añadimos el contenido al fichero.
			bw.flush();

			// Cerramos el BufferedWriter.
			bw.close();

			// Cerramos el Scanner.
			sc.close();

			// Cogemos la excepción que lanza el FileWriter.
		} catch (IOException e) {

			// Imprimimos el error.
			System.out.println("Error: " + e.getMessage());
		}
	}
}
