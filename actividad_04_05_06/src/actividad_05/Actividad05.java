package actividad_05;

import java.util.Scanner;

public class Actividad05 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ejercicio 01");
		System.out.println();
		
		//Pedimos al usuario que ingrese un texto
		System.out.println("Ingrese un texto: ");
		String texto = reader.nextLine();
		
		//Dividir la cadena en palabras usando el espacio como separador
		String[] palabras = texto.split(" ");
		
		//Mostrar cada palabra en una linea distinta
		for(String palabra : palabras) {
			System.out.println(palabra);
		}
		System.out.println();

		System.out.println("Ejercicio 02");
		System.out.println();
		
		reader = new Scanner(System.in);
		
		//Solicitar dos textos al usuario
		System.out.println("Ingresa el primer texto: ");
		String texto1 = reader.nextLine();
		
		System.out.println("Ingresa el segundo texto: ");
		String texto2 = reader.nextLine();
		
		//Comparar los textos respetando mayusculas y minusculas
		if(texto1.equals(texto2)) {
			System.out.println("Los textos son exactamente iguales.");
		}else {
			System.out.println("Los textos no son iguales.");
		}
		
		//Comparar los textos ignorando mayusculas y minusculas
		if(texto1.equalsIgnoreCase(texto2)) {
			System.out.println("Los textos son iguales.");
		}else {
			System.out.println("Los textos no son iguales.");
		}
		System.out.println();
		
		System.out.println("Ejercicio 03");
		System.out.println();
		
		reader = new Scanner(System.in);
		
		//Solicitar al usuario el nombre y dos apellidos
		System.out.println("Ingresa el nombre: ");
		String nombre = reader.nextLine();
		
		System.out.println("Ingresa el primer apellido: ");
		String apellido1 = reader.nextLine();
		
		System.out.println("Ingresa el segundo apellido: ");
		String apellido2 = reader.nextLine();
		
		//Se obtiene las tres primeras letras de cada texto
		//String codigo = getTresLetras(nombre) + get
		
	
	}//Main
	//private static String getTresLetras(String texto) {
		//String resultado = "";
		
		//Recorre hasta 3 letras
		//(int i = 0; i < 3 && i < )
	//}
	
	
	
}//Class
