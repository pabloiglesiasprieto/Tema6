package ejercicio7;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
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
		int eleccion;

		// Declaramos la variable que almacenará la linea.
		String linea = "";

		// Declaramos el array de datos del fichero.
		String[] palabras;

		// Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un flujo.
		try (Scanner rf = new Scanner(new FileReader("src\\ejercicio7\\datosTelefonicos.txt"))) {

			// Cargamos los datos del fichero al mapa.
			while (rf.hasNextLine()) {

				// Guardamos la linea.
				linea = rf.nextLine();

				// Dividimos la linea en 2 partes, clave y valor.
				palabras = linea.split("->");

				// Guardamos en el mapa la información.
				mapa.put(palabras[0], Integer.parseInt(palabras[1]));

			}

			// Cogemos la excepción.
		} catch (IOException ioe) {

			// Lanzamos la excepción.
			System.out.println("El archivo no existe: " + ioe.getMessage());

			// Creamos el fichero.
			try {
				FileWriter fw = new FileWriter("src\\ejercicio7\\datosTelefonicos.txt");

				// Cogemos la excepción
			} catch (IOException e) {

				// Imprimimos el error.
				System.out.println("Error: " + e.getMessage());
			}
		}

		// Creamos un BufferedWriter.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ejercicio7\\datosTelefonicos.txt"))) {

			// Imprimimos el menú.
			System.out.print("Que acción quieres realizar:\n1. Nuevo contacto.\r\n" + "2. Buscar por nombre.\r\n"
					+ "3. Mostrar todos.\r\n" + "0. Salir.\r\n" + "");

			// Guardamos la elección en la variable.
			eleccion = sc.nextInt();

			// Limpiamos el buffer.
			sc.nextLine();

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

					// Le pedimos al usuario que introduzca el nombre.
					System.out.println("Introduce el nombre de la persona a buscar.");

					// Leemos entrada de teclado.
					nombre = sc.nextLine();

					// Buscamos en el mapa si existe la llave.
					if (mapa.containsKey(nombre)) {

						// Imprimimos la información de la persona.
						System.out.print(mapa.get(nombre));

						// Si no se cumple el condicional:
					} else {

						System.out.println("El contacto no existe.");
					}

				}
				// Tercer case.
				case 3 -> {

					// Creamos un bucle que recorrerá las claves del mapa.
					// Recorrer el mapa usando entrySet() y un bucle for-each
					for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {

						// Guardamos la clave en una variable.
						String clave = entrada.getKey();

						// Guardamos el valor en una variable.
						Integer valor = entrada.getValue();

						// Imprimimos la información.
						System.out.println("Nombre: " + clave + ", Telefono: " + valor);
					}
				}
				}
				// Imprimimos el menú.
				System.out.print("Que acción quieres realizar:\n1. Nuevo contacto.\r\n" + "2. Buscar por nombre.\r\n"
						+ "3. Mostrar todos.\r\n" + "0. Salir.\r\n" + "");

				// Guardamos la elección en la variable.
				eleccion = sc.nextInt();

				// Limpiamos el buffer.
				sc.nextLine();
			}
			// Volvemos a recorrer el mapa para añadir la linea al fichero.

			// Creamos un bucle que recorrerá las claves del mapa. Recorrer el mapa usando
			// entrySet() y un bucle for-each
			for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {

				// Limpiamos la linea.
				linea = "";

				// Guardamos la clave en una variable.
				String clave = entrada.getKey();

				// Guardamos el valor en una variable.
				Integer valor = entrada.getValue();

				// Añadimos la información a la linea.
				linea += clave + "->" + valor;

				// Añadimos la linea al fichero.
				bw.write(linea);

				// Añadimos un salto de linea.
				bw.newLine();
			}

			// Añadimos la linea al fichero.
			// Recogemos la excepción.
		} catch (IOException e) {

			// Imprimimos la excepción.
			System.out.println("El fichero no se ha podido escribir: " + e.getMessage());
		}
		// Imprimimos que ha salido del programa.
		System.out.println("Saliste del programa");

		// Cerramos el Scanner.
		sc.close();
	}

}
