package clase;

public class Leyendo {

	public static void main(String[] args) {
		Book l= new Book(1025,"java");
	    l.next();
	    l.next(10);
	    System.out.println(l.getActualPage());
	    
	  }
	}