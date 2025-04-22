package ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {

		// Declaramos la variable que almacenará los nombres.
		String nombre;

		// Declaramos la variable que almacenará la media.
		int mediaEdades;

		// Declaramos la media de las estaturas.
		int mediaEstatura;

		// Declaramos la variable que almacenará el contador de personas.
		int contador = 0;

		// Declaramos la variable que almacenará la suma de edades.
		int sumaEdades = 0;

		// Declaramos la variable que almacenará la suma de estaturas.
		int sumaEstatura = 0;

		// Declaramos la variable que almacenará la linea.
		String linea;

		// Declaramos un array de String que almacenará la linea del fichero dividida.
		String[] data;

		// Creamos un flujo.
		try (BufferedReader br = new BufferedReader(new FileReader("src\\ejercicio3\\Alumnos.txt"))) {
			
			// Guardamos la linea.
			linea = br.readLine();
			
			// Creamos un bucle que recorrerá las lineas del fichero hasta que no haya más.
			while (linea != null) {

				// Guardamos en data los datos del fichero.
				data = linea.split(" ");

				// Imprimimos la información.
				System.out.println("Nombre: " + data[0] + " Edad: " + Integer.parseInt(data[1]) + " Estatura: "
						+ Double.parseDouble(data[2]));

				// Aumentamos la suma de edades.
				sumaEdades += Integer.parseInt(data[1]);
				sumaEstatura += Double.parseDouble(data[2]);

				// Aumentamos el contador de personas.
				contador++;

				// Pasamos a la linea
				br.readLine();
			}
			// Calculamos la media de la estatura y la edad.
			mediaEstatura = sumaEstatura / contador;
			mediaEdades = sumaEdades / contador;

			// Imprimimos la media de las edades y estatura.
			System.out.println("La media de las edades es la siguiente: " + mediaEdades);
			System.out.println("La media de estaturas es la siguiente: " + mediaEstatura);

			// Cogemos la excepción.
		} catch (FileNotFoundException e) {

			// Imprimimos el mensaje de error.
			System.out.println("El fichero no se ha encontrado: " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
