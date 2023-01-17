package primerosejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int altura;
		int radio;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elija una de las dos opciones: \n1: Área del cilindro. \n2: Volumen del cilindro.");
		num = sc.nextInt();
		if(num != 1 && num != 2) {
			System.out.print("Error, opción no contemplada.");
		}
		else {
			System.out.print("Introduzca el radio de la base del cilindro: ");
			radio = sc.nextInt();
			System.out.print("Introduzca la altura del cilindro: ");
			altura = sc.nextInt();
		
			if(num == 1) {
				area(radio, altura);
			}
			else {
				volumen(radio, altura);
			}
		}
		sc.close();
	}
	static void area(int radio, int altura) {
		double area = Math.PI * radio * (altura * radio);
		System.out.print(area + " metros cuadrados.");
	}
	static void volumen(int radio, int altura) {
		double volumen = Math.PI * Math.pow(radio, 2) * altura;
		System.out.print(volumen + " metros cúbicos.");
	}
}

