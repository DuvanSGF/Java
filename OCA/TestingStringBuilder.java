package clase;

public class TestingStringBuilder {

	public static void main(String[] args) {
		
		/*StringBuilder sb1 = new StringBuilder(""+11+3+"AND"+4+5);
		sb1.append(sb1.delete(3, 6));
		System.out.println(sb1);
*/
		StringBuilder sb1 = new StringBuilder(""+11+3+4+5);
		sb1.append(sb1.delete(0, 1));
		System.out.println(sb1);
	}

}
