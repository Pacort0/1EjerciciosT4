package primerosejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		String letra;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una letra: ");
		letra = sc.next();
		
		System.out.print(letra(letra));
		
		sc.close();
	}
	static Boolean letra(String letra) {
		Boolean vocal;
		switch(letra) {
		case "a":
			vocal = true;
			break;
		case "e": 
			vocal = true;
			break;
		case "i": 
			vocal = true;
			break;
		case "o": 
			vocal = true;
			break;
		case "u": 
			vocal = true;
			break;
			default:
				vocal = false;
		}
		return(vocal);
	}
}
