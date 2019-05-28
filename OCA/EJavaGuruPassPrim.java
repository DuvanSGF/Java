package clase;

public class EJavaGuruPassPrim {

	public static void main(String args[]) {
		int age = 10;
	
		anotherMethod(age);
		System.out.println(age);
		someMethod(age);
		++age;
		System.out.println(age);
		}
		static void anotherMethod(int val) {
			val = 20;
			
			System.out.println(val);
		}
		static void someMethod(int val) {
			++val;
			System.out.println(val); 
			
		}
		public String eJava(int age, String name, double duration) {
			return name;
			
		}

	}
		