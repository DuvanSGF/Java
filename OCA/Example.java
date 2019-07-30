package herencia;

public class Example {

	private String name = "dog";
	// private String name;
	{
		System.out.println(name);
	}
	
	private static int COUNT = 0;
	static {
		System.out.println(COUNT);
	}
	{
		COUNT += 11;
		System.out.println(COUNT);
	}

	public Example() {
		System.out.println("constructor");
	}
}

class Demo {
	static {
		add(2);
	}

	static void add(int number) {
		System.out.print(number + " ");
	}

	Demo() {// constructor
		add(5);
	}

	static {
		add(4);
	}
	{
		add(6);
	}
}
