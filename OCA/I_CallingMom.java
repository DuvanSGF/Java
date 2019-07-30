package herencia;

public class I_CallingMom extends Employee {
}

class Project {
public static void main(String[] args) {
	Employee call = new I_CallingMom();
	call.callMom();
	
	I_CallingMom  llamada = new I_CallingMom();
	llamada.callMom();
	
	Employee.callMom();
	I_CallingMom.callMom();
}
}