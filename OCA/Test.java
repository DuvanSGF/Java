package herencia;

interface Movable {
	void move();
}

class Person implements Movable {
	public void move() {
		System.out.println("Person move");
	}

class Vehicle implements Movable {
	public void move() {
		System.out.println("Vehicle move");}
	}
class Test {  
	// INSERT CODE HERE 
	//void walk(Movable movable) {//Si se puede
	//void walk(Person movable) {//si se puede
	//void walk(Vehicle movable) { //si se puede
	//void walk(int movable) {Asi no se puede
	void walk() {
		
	movable.move();
	}
}
}
