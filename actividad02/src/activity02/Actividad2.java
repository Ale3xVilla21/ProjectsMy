package activity02;

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
		
		if(edad2 > 17) {
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
			System.out.println("numero: " + i);
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
		
		System.out.println("Ejercicio 6");
		System.out.println();
		sc = new Scanner(System.in);
		
		System.out.println("Ingrese el numero: ");
		int n = sc.nextInt();
		
		for(int i = 1;i <= n; i++) {
			System.out.println("numero: " + i);
		}
		System.out.println();
		
		System.out.println("Ejercicio 7");
		System.out.println();
		sc = new Scanner(System.in);
		
		System.out.println("Introduzca su calificacion entre 0 y 10: ");
		int nota = sc.nextInt();
		
		if(nota < 3) {
			System.out.println("Muy deficiente.");
		}else if(nota < 5){
			System.out.println("Insuficiente.");
		}else if(nota < 6) {
			System.out.println("Bien.");
		}else if(nota < 9) {
			System.out.println("Notable.");
		}else{
			System.out.println("Sobresaliente.");
		}
		System.out.println();
		
		System.out.println("Ejercicio 8");
		System.out.println();
		sc = new Scanner(System.in);
		
		System.out.println("Introduzca el numero positivo: ");
		int x = sc.nextInt();
		
		if(x < 0) {
			System.out.println("Error, introduzca solo numeros positivos. ");
		}else {
			long factorial = 1;
			
			for(int i = 1;i <= x; i++) {
				factorial *= i;
			}
			System.out.println("El factorial de " + x + " es: " + factorial);
		}
		System.out.println();
		
		System.out.println("Ejercicio 9");
		System.out.println();
		sc = new Scanner(System.in);
		
		System.out.println("Introduzca la hora: ");
		int hora = sc.nextInt();
		
		System.out.println("Introduzca los minutos: ");
		int min = sc.nextInt();
		
		System.out.println("Introduzca los segundos: ");
		int seg = sc.nextInt();
		
		seg++;//Incrementa los segundos en 1.
		
		if(seg == 60) {
			seg = 0;//Reinicia los segundos a 0.
			min++;//Incrementa los minutos.
			
			if(min == 60) {
				min = 0;//Reinicia los minutos a 0.
				hora++;//Incrementa las horas.
				
				if(hora == 24) {
					hora = 0;//Reinicia las horas a 0 si se alcanza las 24 horas.
				}
			}
		}
		System.out.println("La hora transcurrido un segundo es: " + hora + ":" + min + ":" + seg);
		System.out.println();
		
		System.out.println("Ejercicio 10");
		System.out.println();
		sc = new Scanner(System.in);
		boolean hayNegativo = false;//Variable para verificar si hay un numero negativo.
		
		System.out.println("Ingrese 10 numeros: ");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Numero " + i + ":");
			int numero =sc.nextInt();
			
			//Validar para que el numero no sea 0
			if(numero == 0) {
				System.out.println("El numero no puede ser 0, por favor introduzca otro numero.");
				numero = sc.nextInt();
			}
			
			//verificamos si el numero es negativo.
			if(numero < 0) {
				hayNegativo = true;
			}
		}
		
		if(hayNegativo) {
			System.out.println("Se ha ingresado al menos un numero negativo.");
		}else {
			System.out.println("No se ha ingresado ningun numero negativo.");
		}
		System.out.println();
		
		System.out.println("Ejercicio 11");
		System.out.println();
		sc = new Scanner(System.in);
		
		int positivos = 0;//Contador de numeros positivos.
		int negativos = 0;//Contador de numero negativos.
		
		System.out.println("Introduce 10 numeros: ");
		
		for(int i = 1; i <= 10; i++) {//Se repetira 10 veces
			System.out.println("Numero " + i + ":");
			int numero2 = sc.nextInt();
			
			//Verificar que el numero no sea 0.
			while( numero2 == 0) {
				System.out.println("El numero no puede ser cero, por favor ingrese otro: ");
				numero2 = sc.nextInt();//Se repetira hasta que el numero sea distinto a 0.
			}
			
			//Contar positivos y negativos.
			if(numero2 > 0) {
				positivos++;//Incrementa el contador de positivos.
			}else {
				negativos++;//Si es lo contrario incrementara el contador negativos.
			}
		}
		
		//Mostrar Resultados.
		System.out.println("La cantidad de numeros positivos es: " + positivos);
		System.out.println("La cantidad de numeros negativos es: " + negativos);
		System.out.println();
		
		System.out.println("Ejercicio 12");
		System.out.println();
		sc = new Scanner(System.in);
		
		int numero;//se depositara cada numero que se ingrese en teclado.
		int positivo = 0;//Contador para cantidad de numeros positivos.
		int negativo = 0;//Contador para cantidad de numeros negativos.
		boolean hayNegativos = false;
		
		System.out.println("Introduzca los numeros: ");
		
		do{
			numero = sc.nextInt();

			if(numero > 0){
				positivo++;
			}else if(numero <0){
				negativo++;
				hayNegativos = true;
			}
		}while (numero != 0);
		
		if(hayNegativos){
			System.out.println("Se ha introducido algun numero negativo.");
		}else{
			System.out.println("No se ha introducido ningun numero negativo.");
		}

		System.out.println("Cantidad de numeros positivos: " + positivo);
		System.out.println("Cantidad de numeros negativos: " + negativo);
		System.out.println();

		System.out.println("Ejercicios 13");
		System.out.println();
		
		int suma = 0;//Variable para almacenar la suma.
		int producto = 1;//variable para almacenar el producto.

		for(int i = 1; i <= 10; i++){
			suma += i;//sumar el numero actual a la variable suma.
			producto *= i;//multiplicar el numero al producto.
		}
		System.out.println("La suma de los 10 primero numeros naturales es: " + suma);
		System.out.println("El producto de los 10 primeros numeros naturales son: " + producto);
		System.out.println();
	}//Main
}//Class
