package clase;

public class EJavaGuruPassObjec1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "anotherMethod";
		anotherMethod(p);
		System.out.println(p.name);
		someMethod(p);
		System.out.println(p.name);

	}
	static void someMethod(Person p) {
		p.name = "someMethod";
		System.out.println(p.name);
		}
		static void anotherMethod(Person p) {
		p = new Person();
		p.name = "anotherMetod";
		System.out.println(p.name);

		}
	}
