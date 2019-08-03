package Examen;

public class Docente extends Persona{
	public String materia;

	public Docente(String name, int edad, String materia) {
		super(name, edad);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	

}
