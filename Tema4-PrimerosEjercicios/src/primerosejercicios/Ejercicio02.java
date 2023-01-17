package primerosejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca el segundo número: ");
		num2 = sc.nextInt();
		
		relleno(num1, num2);
		
		sc.close();
	}
	static void relleno (int num1, int num2){
		int mayor = 0;
		int menor = 0;
		
		if(num1 > num2) {
			mayor = num1;
			menor = num2;
		}
		else if(num2 > num1) {
			mayor = num2;
			menor = num1;
		}
		
		for(int i = menor+1; i < mayor; i++) {
			System.out.print( i + " ");
		}
	}
}
