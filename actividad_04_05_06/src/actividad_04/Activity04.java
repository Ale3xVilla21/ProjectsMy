package actividad_04;

import java.util.Scanner;

public class Activity04 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ejercicio 01");
		System.out.println();
		
		//Haremos un array para almacenar los 10 numeros.
		double[] numero = new double[10];
		
		//El usuario escribira 10 numeros por teclado
		System.out.println("Introduce 10 numeros reales: ");
		for(int i = 0; i < 10; i++) {
			System.out.println("Numero " + (i + 1) + ": ");
			numero[i] = reader.nextDouble();
		}
		
		//Se mostrara los numeros ingresados
		System.out.println("Los numeros ingresados son: ");
		for(int i = 0; i < 10; i++) {
			System.out.println("Numero " + (i + 1) + ": " + numero[i]);
		}
		System.out.println();
		
		System.out.println("Ejercicio 02");
		System.out.println();
		reader = new Scanner(System.in);
		
		double[] numeros = new double[10];
		
		double suma = 0;//Variable para almacenar la suma de los numeros
		
		System.out.println("Introduzca 10 numeros reales: ");
		
		//bucle para leer los numeros y almacenarlos en el array
		for(int i = 0; i < 10; i++) {
			System.out.println("Introduce el numero " + (i + 1) + ": ");
			numeros[i] = reader.nextDouble();//guardando el numero en el array
			
			//Se suma cada numero que ingresa el usuario
			suma += numeros[i];
		}
		
		//Mostrar la suma de todos los numeros ingresados
		System.out.println("La suma de los numeros es: " + suma);
		System.out.println();
		
		System.out.println("Ejercicio 03");
		System.out.println();
		
		reader = new Scanner(System.in);
		
		double[] num = new double[10];
		
		System.out.println("Introduce 10 numeros reales: ");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Introduce el numero " + (i + 1) + ": ");
			num[i] = reader.nextDouble();
		}
		
		//Variables max y min para almacenarlas
		double max = num[0];//Se asume que el primer numero es el maximo.
		double min = num[0];//Se asume que el primer numero es el minimo.
		
		//Recorre un array para encontrar el max y min.
		for(int i = 1; i < 10; i++) {
			if(num[i] > max) {
				max = num[i];//Actualiza el maximo
			}
			if(num[i] < min) {
				min = num[i];//Actualiza el minimo
			}
		}
		
		//Se mostrara el maximo y minimo
		System.out.println("El numero maximo es: " + max);
		System.out.println("El numero minimo es: " + min);
		System.out.println();
		
		System.out.println("Ejercicio 04");
		System.out.println();
		
		reader = new Scanner(System.in);
		
		//Se crea un array para almacenar 20 numeros enteros
		int[] number = new int[20];
		
		//Variables para almacenar las sumas de los numeros positivos y negativos
		int sumaPositivo = 0;
		int sumaNegativo = 0;
		
		System.out.println("Introduce 20 numeros enteros: ");
		
		//Bucle para leer los numeros y almacenarlos en el array
		for(int i = 0; i < 20; i++) {
			System.out.println("Introduce el numero" + (i + 1) + ": ");
			number[i] = reader.nextInt();//Guarda el numero en el array
			
			//Si el numero es positivo, se suma a la variable sumaPositivo
			if(number[i] > 0) {
				sumaPositivo += number[i];
			}
			
			//Si el numero es negativo, se suma a la variable sumaNegativo
			else if (number[i] < 0) {
				sumaNegativo += number[i];
			}
		}
		
		//Se mostrara la suma de los numeros positivos y negativos por separado
		System.out.println("La suma de los numeros positivos es: " + sumaPositivo);
		System.out.println("La suma de los numeros negativos es: " + sumaNegativo);
		System.out.println();
		
		System.out.println("Ejercicio 05");
		System.out.println();
		reader = new Scanner(System.in);
		
		double[] numero2 = new double[20];
		
		double sumando = 0;//Variable para almacenar la suma de los numeros
		
		System.out.println("Introduzca 20 numeros reales: ");
		
		for(int i = 0; i < 20; i++) {
			System.out.println("Introduce el numero " + (i + 1) + ": ");
			numero2[i] = reader.nextDouble();//Guardamos el numero en el array
			
			//Sumando cada numero que el usuario ingresa
			sumando += numero2[i];
		}
		
		//Calculando la media: Suma de valores dividido entre el numero de valores
		double media = sumando / 20;
		
		//Mostrando la media por pantalla
		System.out.println("La media de los numeros es: " + media);
		System.out.println();
		
		System.out.println("Ejercicio 06");
		System.out.println();
		reader = new Scanner(System.in);
		
		//Escribir el valor de N 
		System.out.println("Introduce el valor de N: ");
		int n = reader.nextInt();
		
		//Escribir el valor de M
		System.out.println("Introduce el valor de M: ");
		int m = reader.nextInt();
		
		//crear un array de tamaño N
		int[] depoN = new int[n];
		
		//Rellenando el array con el valor M
		for(int i = 0; i < n; i++) {
			depoN[i] = m;
		}
		
		//Mostrando el array por pantalla
		System.out.println("El array de tamaño " + n + "lleno con el valor " + m + " es:");
		for(int i = 0; i < n; i++) {
			System.out.println(depoN[i] + " ");//Se imprime cada valor del array
		}
		System.out.println();
		
		System.out.println("Ejercicio 07");
		System.out.println();
		reader = new Scanner(System.in);
		
		//Escribir el valor de P 
		System.out.println("Introduce el valor el P: ");
		int p = reader.nextInt();
		
		//Escribir el valor de Q
		System.out.println("Introduce el valor de Q: ");
		int q = reader.nextInt();
		
		//Calcular el tamaño del array 
		int tamañoArray;
		
		if(p <= q) {
			tamañoArray = q - p + 1;
		}else {
			tamañoArray = p - q + 1;
		}
		
		//Se crea un array 
		int[] array = new int[tamañoArray];
		
		//Llenar el array con los valores desde P hasta Q
		if(p <= q) {
			for(int i = 0; i < tamañoArray; i++) {
				array[i] = p + i;
			}
		}else {
			for(int i = 0; i < tamañoArray; i++) {
				array[i] = p - i;
			}
		}
		
		//Mostrando el array por pantalla
		System.out.println("El array con valores desde " + p + "hasta " + q + " es:");
		for(int i = 0; i < tamañoArray; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println();
		
		System.out.println("Ejercicio 08");
		System.out.println();
		reader = new Scanner(System.in);
		
		double[] number2 = new double[200];//Creando un array de 100 numeros reales
		
		//Creando un array con numeros aleatorios entre 0.0 y 1.0
		for(int i = 0; i < number.length; i++) {
			number2[i] = Math.random();//Genera un numero aleatorio entre 0.0 y 1.0
		}
		
		//Pedir un valor real R al usuario
		System.out.println("Introduzca un valor real R: ");
		double r = reader.nextDouble();
		
		//contar cuantos numeros en el array son iguales o superiores a R
		int contador = 0;
		for(int i = 0; i < number2.length; i++) {
			if(number2[i] >= r) {
				contador++;
			}
		}
		
		//Mostrar el resultado
		System.out.println("Hay " + contador + " numeros en el array que son iguales o iguales o superiores a " + r);
		System.out.println();
		
		System.out.println("Ejercicio 09");
		System.out.println();
		
	}//Main
}//Class
