package primerosejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduzca un valor positivo: ");
		num = sc.nextInt();
		
		System.out.print(esPrimo(num));
		
		sc.close();
	}
	
	static Boolean esPrimo (int num) {
		Boolean primo = true;
		for(int i = num - 1; i > 1; i--) {
			if(num % i == 0) {
				primo = false;
				break;
			}
		}
		return (primo);
	}
}
