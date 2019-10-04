package CodePoetry;

public class Birthday extends Person {
	
	public Birthday(String nombre, int edad) {
		super(nombre,edad);
		this.edad = edad + 1;
			
	}
	
	public void Birthday() {
		System.out.println("Nombre: "+getNombre()+
				"\nEdad:"+getEdad());
	}

}