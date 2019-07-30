package herencia;

class Dog {
	private String name;
	private String breed;
	private double weight;

	public Dog(String name) {
		this.name = name;
		breed = "husky";
		weight = 30.0;
// Dog(name, "husky"); // does not compile
// new Dog(name, "husky"); // compiles but does not do what we want
		System.out.println("constructor 1");
	}

	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
		weight = 30.0;
		System.out.println("constructor 2");
	}

	public Dog(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
		System.out.println("constructor 3");
	}

	public void print() {
		System.out.println(name + " " + breed + " " + weight); 
	}
}


