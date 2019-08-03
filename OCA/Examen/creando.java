package Examen;

import java.io.FileNotFoundException;
import java.io.IOException;

public class creando {

	public static void main(String[] args) throws FileNotFoundException, IOException  {
		Estudiante ingenieria = new Estudiante("Duvan", 20, "2019-1", 3);
		
		//Imprime los datos en consola
		//ingenieria.datos();
		
		ingenieria.cargarArchivo("C://Ingenieria_Software//hola.txt");
		
		ingenieria.escribir();
		ingenieria.muestraContenido("C://Ingenieria_Software//hola.txt");
	}

}
