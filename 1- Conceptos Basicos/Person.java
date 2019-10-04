package CodePoetry;

public class Person {
	
	private String nombre;
	protected int edad = 0;
	
	public Person( String nombre, int edad ){
		this.nombre = nombre;
		this.edad = edad;
	
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public void celebrateBirthday(){
		this.edad += 1;
		
		
	}
}
