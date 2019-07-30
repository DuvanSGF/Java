package herencia;

public class SoftwareEngineer extends Employee implements Trainable {

	String[] programmingLanguages;

	void writeCode() {
	}

	public void attendTraining() {
		System.out.println("Prog - attendTraining");
	}
	
	
}
	/*
	SoftwareEngineer (String val) {//Esto es un constructor : Tiene el mismo nombre de la clase. Puede o no tener un acces modifier
		name = val;//No puedo ser Heredado. 
		
	}
	String getName() {
		return name; //Es un metodo String siempre debe retoenar algo. 
	}
	

}
*/