package calculadora;

import java.util.Scanner;

public class Addition {

	public static void main(String[] Duvan) {
		
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		
		System.out.println("Enter the first number");
		number1 = input.nextInt();
		
		System.out.println("Enter the second number");
		number2 = input.nextInt();		
		
		sum = number1 + number2;
		
		System.out.println("La suma es "+ sum);
		

	}

}
