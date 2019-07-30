package herencia;

public class Manager extends Employee implements Interviewer, Trainable {

	int teamSize;

	void reportProjectStatus() {
	}

	public void conductInterview() {
		System.out.println("Mgr - conductInterview");
	}

	public void attendTraining() {
		System.out.println("Mgr - attendTraining");
	}
}