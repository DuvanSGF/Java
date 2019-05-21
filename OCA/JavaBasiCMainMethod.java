package clase;

public class JavaBasiCMainMethod {

	public static void main(String... cmd) {
			/* Este main se ejecuta primero porque tiene los 3 puntos o
			 *  cunado hay corchetes pero los dos
			 *   no puden estar al tiempo
		 	*/
		System.out.println(20);
	}
	
	public static void main(String arg) {
		System.out.println("List of argument:" + arg);
	}
	
	public static void main(int number) {
		System.out.println("Hello = " + number);

	}

}
