package herencia;

public class Employee {
	
	protected String name;
	String address;
	protected String phoneNumber;
	public float experince;
	
	
	static void callMom() {
		System.out.println("Hello Mom.. How are you doing!");
		
	}
}

interface Interviewer {
	public void conductInterview();
}

interface Trainable {
	public void attendTraining();
}


