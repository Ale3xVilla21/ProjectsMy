package primerActividad;

import java.util.Scanner;

public class Work {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Actividad 1");
		System.out.println();
		System.out.println("Buenos dias.");
		System.out.println();
		
		System.out.println("Actividad 2");
		System.out.println();
		
		double lado = 5;
		double area = lado * lado;
		
		System.out.println("El area de un cuadrado es: " + area);
		System.out.println();
		
		System.out.println("Actividad 3");
		System.out.println();
		reader = new Scanner(System.in);

		System.out.println("Introduzca el area del cuadrado: ");
		double lado2 = reader.nextDouble();
		double area2 = lado2 * lado2;
		
		System.out.println("El resultado es: " + area2);
		System.out.println();
		
		System.out.println("Actividad 4");
		System.out.println();
		reader = new Scanner(System.in);

		System.out.println("Introduzca el primer numero: ");
		double num1 = reader.nextDouble();
		
		System.out.println("Introduzca el segundo numero: ");
		double num2 = reader.nextDouble();
		
		double suma = num1 + num2;//suma
		double resta = num1 - num2;//resta
		double multi = num1 * num2;//multiplicacion
		double div = num1 / num2;//division
		
		System.out.println("La suma de los numeros introducidos es: " + suma);
		System.out.println("La resta de los numeros introducidos es: " + resta);
		System.out.println("La multiplicacion de los numeros introducios es: " + multi);
		System.out.println("La division de los numeros introducidos es: " + div);
		System.out.println();
		
		System.out.println("Actividad 5");
		System.out.println(); 
		reader = new Scanner(System.in);

		System.out.println("Introduce el radio: ");
		double radio = reader.nextDouble();

		System.out.println("La longitud de la circunferencia es: " + radio * Math.PI * 2);
		System.out.println("El area del circulo es: " + Math.PI * Math.pow(radio, 2));
		System.out.println("El volumen de la esfera es: " + Math.PI * Math.pow(radio, 3) * 4/3);
		System.out.println();

		System.out.println("Actividad 6");
		System.out.println();
		reader = new Scanner(System.in);

		System.out.println("Introduzca el precio del articulo: ");
		double precioVenta = reader.nextDouble();

		System.out.println("Introduzca el precio de venta real: ");
		double precioReal = reader.nextDouble();

		double descuento = ((precioVenta - precioReal)* 100 / precioVenta);

		System.out.println("El porcentaje del descuento realizado es: " + descuento + "%");
		System.out.println();

		System.out.println("Actividad 7");
		System.out.println();
		reader = new Scanner(System.in);

		System.out.println("Introduzca la distancia de millas marinas: ");
		double millasMarinas = reader.nextDouble();

		double metros = millasMarinas * 1852;

		System.out.println("Las distancias en metros es: " + metros + " metros");
		System.out.println();

		System.out.println("Actividad 8");
		System.out.println();
		reader = new Scanner(System.in);

		System.out.println("Introduzca el primer numero: ");
		double number1 = reader.nextDouble();

		System.out.println("Introduzca el segundo numero: ");
		double number2 = reader.nextDouble();

        //Usando la clase Math.min y Math.max.
		double menor = Math.min(number1, number2);
		double mayor = Math.max(number1, number2);

		System.out.println("Los numeros en orden ascendente son: " + menor + "; " + mayor);
		System.out.println();

		System.out.println("Actividad 9");
		System.out.println();
		reader = new Scanner(System.in);

		System.out.println("Introduce el primer numero: ");
		double numero1 = reader.nextDouble();
		
		System.out.println("Introduce el segundo numero: ");
		double numero2 = reader.nextDouble();

		double mayor1 = Math.max(numero1, numero2);

		System.out.println("El mayor numero es: " + mayor1);
		System.out.println("¿Los dos numeros son iguales? \n" + (numero1 == numero2));
		System.out.println();

		System.out.println("Actividad 10");
		System.out.println();
		reader = new Scanner(System.in);

		System.out.println("Introduzca el primer numero: ");
		double n1 = reader.nextDouble();
		System.out.println("Introduzca el segundo numero: ");
		double n2 = reader.nextDouble();
		System.out.println("Introduzca el tercer numero: ");
		double n3 = reader.nextDouble();

		double mayor2 = Math.max(Math.max(n2, n3),n1);

		System.out.println("El mayor numero es: " + mayor2);
		System.out.println();

		System.out.println("Ejercico 11");
		System.out.println();
		reader = new Scanner(System.in);

		System.out.println("Escriba el primer numero: ");
		double numA = reader.nextDouble();
		System.out.println("Escriba el segundo numero: ");
		double numB = reader.nextDouble();

		double suma2 = numA + numB;
		System.out.println("Su suma es: " + suma2);

		double resta2 = numA - numB;
		System.out.println("Su resta es: " + resta2);

		double multi2 = numA * numB;
		System.out.println("Su producto es: " + multi2);

		boolean error = (numB == 0);
		System.out.println(error + " Error, no se puede dividir porque seria indeterminado.");

		double div2 = numA / numB;
		System.out.println("Su division es: " + div2);
		System.out.println();

		System.out.println("Ejercicio 12");
		System.out.println();
		reader = new Scanner(System.in);

		System.out.println("Introduzca el primer numero: ");
		double primer = reader.nextDouble();
		System.out.println("Introduzca el segundo numero: ");
		double segundo = reader.nextDouble();

		double mayor3 = Math.max(primer, segundo);

		System.out.println("El numero mayor es: " + mayor3);
		System.out.println();

		System.out.println("Ejercicio 13");
		System.out.println();
		System.out.println("Ingrese el numero: ");
		double uno = reader.nextDouble();

		System.out.println((uno > 0) + " El numero es positivo.");
		System.out.println((uno < 0) + " El numero es negativo.");
		reader.close();
	}//main
}//class
