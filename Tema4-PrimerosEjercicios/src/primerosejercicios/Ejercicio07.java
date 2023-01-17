package primerosejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduzca un valor positivo: ");
		num = sc.nextInt();
		
		System.out.print("El número introducido tiene " + divisores(num) + " divisores.");
		
		sc.close();
	}
	static int divisores (int num) {
		int contador = 0;
		Boolean primo;
		
		for(int i = num; i > 1; i--) {
			
			if(num % i == 0) {
				primo = divPrimos(i);
				if(primo) {
					contador++;
				}
			}
		}
		return contador;
	}
	static Boolean divPrimos (int num) {
		Boolean primo = true;
		
		for(int i = num - 1; i > 1; i--) {
			
			if(num % i == 0) {
				primo = false;
				break;
			}
		}
		return primo;
	}
}
