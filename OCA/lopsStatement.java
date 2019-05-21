package clase;

public class lopsStatement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		loop:
		for (int days : arr) {
		    switch (days) {
		    case 1:
		        System.out.print("Lunes ");
		        break;
		    case 2:
		        System.out.print("Martes ");
		        break;
		    case 3:
		        System.out.print("Miercoles ");
		        continue loop;
		    default:
		        break loop;
		    }
		    System.out.print("(" + days + ") ");
		}}}