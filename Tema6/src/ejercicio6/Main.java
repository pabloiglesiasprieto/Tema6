package ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		// Creamos un array de String.
		String[] listaDesordenada;

		// Creamos un array de enteros ordenados.
		Integer[] listaOrdenada;

		// Creamos una variable que almacenará la linea.
		String linea;

		// Creamos un BufferedReader.
		try (BufferedReader br = new BufferedReader(new FileReader("src\\ejercicio6\\NumerosDesordenados.txt"))) {

			// Almacenamos la linea en la variable.
			linea = br.readLine();

			// Almacenamos los datos en el array.
			listaDesordenada = linea.split(" ");

			// Inicializamos el array de numeros ordenados.
			listaOrdenada = new Integer[listaDesordenada.length];

			// Creamos un for que recorra los índices del array de la lista desordenada.
			for (int i = 0; i < listaDesordenada.length; i++) {
				listaOrdenada[i] = Integer.parseInt(listaDesordenada[i]);
			}

			// Ordenamos la lista.
			Arrays.sort(listaOrdenada);

			// Imprimimos la lista.
			System.out.println(Arrays.toString(listaOrdenada));

			// Cogemos la excepción.
		} catch (IOException e) {

			// Imprimimos el error.
			System.out.println("El archivo no se ha encontrado: " + e.getMessage());
		}
	}
}
