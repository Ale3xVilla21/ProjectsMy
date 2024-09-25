package actividad01;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ejercicio 1");
		System.out.println();
		System.out.println("Ingrese su edad: ");
		double edad = sc.nextDouble();
		
		if(edad > 17) {
			System.out.println("Eres mayor de edad.");
		}
		System.out.println();
		
		System.out.println("Ejercicio 2");
		System.out.println();
		sc = new Scanner(System.in);
		
		System.out.println("Escriba su edad: ");
		double edad2 = sc.nextDouble();
		
		if(edad2 >17) {
			System.out.println("Eres mayor de edad.");
		}else {
			System.out.println("Eres menor de edad.");
		}
		System.out.println();
		
		System.out.println("Ejercicio 3");
		System.out.println();
		
		for(int i = 1; i <= 20; i++) {
			System.out.println("numero: " + i);
		}
		System.out.println();
		
		System.out.println("Ejercicio 4");
		System.out.println();
		
		for(int i = 2; i <= 200; i += 2) {
			System.out.println("numero par: " + i);
		}
		System.out.println();
		
		System.out.println("Ejercicio 5");
		System.out.println();
		
		for(int i = 1; i <= 200; i ++) {
			
			if(i % 2 == 0) {
				System.out.println("Numero par: " + i);
			}
		}
		System.out.println();
	}//Main
}//Class
