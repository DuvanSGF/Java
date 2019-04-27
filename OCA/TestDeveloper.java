import java.util.Arrays;
public class TestDeveloper {

	public static void main(String...dj) {
		System.out.println(
				"*** Builder Pattern Ex:  ***\n");
		
		Developer dev = new Developer.Builder()
				.name("@Software.bugs.io")
				.surname("Bugs")
				.age(21)
				.language(Arrays.asList(
						"Java", "Python"))
				.build();
			
		// Mostramos los resultados
		System.out.println( dev );
		
		// Forma clasica de Crear un objeto
		
		/*
		 * Developer dev = new Developer();
		 * dev.setName("@Software.bugs.io");
		 * dev.setAge(21);
		 * dev.setLanguage(Array.asList(
		 * 			"JS", "C#"));
		 * 
		 * */
		
	}

}
