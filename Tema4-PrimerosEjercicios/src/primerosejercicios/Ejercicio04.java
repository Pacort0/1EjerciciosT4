package primerosejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número: ");
		a = sc.nextInt();
		System.out.print("Introduzca el segundo número: ");
		b = sc.nextInt();
		
		int messi = maximo(a, b);
		
		System.out.print("El máximo de ambos números es " + messi);
		
		sc.close();
	}
	
	static int maximo (int x, int y) {
		int maximo = 0;
		if (x > y) {
			maximo = x;
		}
		else {
			maximo = y;
		}
		return (maximo);
	}

}
