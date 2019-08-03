package Examen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Estudiante extends Persona{
	
	public  String matricula;
	public int carrera;
	private static ArrayList<String>student = new ArrayList<String>();
	 
	public Estudiante(String nombre, int edad, String matricula, int carrera) {
		super(nombre,edad);
		this.matricula = matricula;
		this.carrera = carrera;
		
	}
	
	
	public static void cargarArchivo(String file)throws FileNotFoundException, IOException
	{
		try {
			FileReader fl = new FileReader(file);
			BufferedReader br = new BufferedReader(fl);

			String linea;
			while ((linea = br.readLine()) != null)

				student.add(linea);
			fl.close();
		} catch (Exception e) {
			System.out.println("Hay una excepcion leyendo el archivo" + file + ":" + e);
		}
	}
	  static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
	      String cadena;
	      FileReader f = new FileReader(archivo);
	      BufferedReader b = new BufferedReader(f);
	      while((cadena = b.readLine())!=null) {
	          System.out.println(cadena);
	      }
	      b.close();
	}
	public static void escribir() {
		ArrayList<Estudiante>student = new ArrayList<Estudiante>();
		Estudiante ingenieria = new Estudiante("Duván",21, "2019-1", 1);
		student.add(ingenieria);
		{
	        FileWriter fichero = null;
	        PrintWriter pw = null;
	        try
	        {
	            fichero = new FileWriter("C://Ingenieria_Software//hola.txt");
	            pw = new PrintWriter(fichero);

	            for (Estudiante student1:student)
	                pw.println("Nombre: "+ingenieria.getNombre()+
	        				"\nEdad: " +ingenieria.getEdad()+
	        				"\nMatricula: "+ingenieria.getMatricula()+
	        				"\nCarrera: "+ingenieria.getCarrera());
	            

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {

	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
	    }
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getCarrera() {
		return carrera;
	}
	public void setCarrera(int carrera) {
		this.carrera = carrera;
	}
	public void datos() {
		System.out.println("Nombre: "+getNombre()+
				"\nEdad: " +getEdad()+
				"\nMatricula:"+getMatricula()+
				"\nCarrera:"+getCarrera());
	}
}
	

