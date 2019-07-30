package herencia;

public class Engineer extends Persona{
	private int codigoEngineer;
	private float notaFinal;
	
	public Engineer(String nombre, String apellido, int edad, int codigoEngineer, float notaFinal) {
		super(nombre, apellido, edad);
		this.codigoEngineer = codigoEngineer;
		this.notaFinal = notaFinal;
			
	}
	
	public void Engineer() {
		System.out.println("Nombre: "+getNombre()+
				"\nApellido: " +getApellido()+
				"\nEdad:"+getEdad()+
				"\nCodigo:"+codigoEngineer+
				"\nNota Final:"+notaFinal);
	}

}
