package primerosejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero positivo: ");
		num = sc.nextInt();
		
		eco (num);
		
		sc.close();
	}
	static void eco (int veces){
		for(int i = veces; i > 0; i--) {
			System.out.println("Eco...");
		}
	}
}
