package primerosejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		int num1, num2;
		int opcion;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el valor del primer operando: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca el valor del segundo operando: ");
		num2 = sc.nextInt();
		
		System.out.println("Introduzca la operación que desea realizar: "
				+ "\n 1) Suma"
				+ "\n 2) Resta"
				+ "\n 3) Multiplicacion"
				+ "\n 4) División");
		opcion = sc.nextInt();
		
		System.out.print(calculadora(num1, num2, opcion));
		
		sc.close();
	}
	
	static double calculadora (int num1, int num2, int opcion) {
		double resultado = 0;
		
		switch(opcion) {
		case 1: 
			resultado = num1 + num2;
			break;
		case 2:
			resultado = num1 - num2;
			break;
		case 3:
			resultado = num1 * num2;
			break;
		case 4:
			resultado = num1 / num2;
			break;
			default:
				System.out.println("La opción introducida no existe");
		}
		return resultado;
	}
}
