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
		System.err.println("Introduzca el area del cuadrado: ");
		double lado2 = reader.nextDouble();
		double area2 = lado2 * lado2;
		
		System.out.println("El resultado es: " + area2);
		System.out.println();
		
		System.out.println("Actividad 4");
		System.out.println();
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
		System.out.println("Introduce el radio: ");
		double radio = reader.nextDouble();

		System.out.println("La longitud de la circunferencia es: " + radio * 2 * Math.PI);
		System.out.println("El area del circulo es: " + Math.PI * Math.pow(radio, 2));
		System.out.println("El volumen de la esfera es: " + 4 / 3 * Math.PI * Math.pow(radio, 3));
		System.out.println();

		System.out.println("Actividad 6");
		System.out.println();
		System.out.println("Introduzca el precio del articulo: ");
		double precio = reader.nextDouble();

		System.out.println("Introduzca el precio de venta real: ");
		double venta = reader.nextDouble();

		double descuento = ((precio - venta) / precio) * 100;

		System.out.println("El porcentaje del descuento realizado es: " + descuento + "%");
		System.out.println();

		System.out.println("Actividad 7");
		System.out.println();
		System.out.println("Introduzca la distancia de millas marinas: ");
		double millasMarinas = reader.nextDouble();

		double metros = millasMarinas * 1852;

		System.out.println("Las distancias en metros es: " + metros + " metros");
		System.out.println();

		System.out.println("Actividad 8");
		System.out.println();
		System.out.println("Introduzca el primer numero: ");
		double number1 = reader.nextDouble();

		System.out.println("Introduzca el segundo numero: ");
		double number2 = reader.nextDouble();

		if(number1 > number2)
		{
			System.out.println("El orden ascendente empieza con: " + number1 + "," + number2);
		}else
		{
			System.out.println("El orden ascendente empieza con: " + number2 + "," + number1);
		}
		System.out.println();

		System.out.println("Actividad 9");
		System.out.println();
		System.out.println("Introduce el primer numero: ");
		double numero1 = reader.nextDouble();
		
		System.out.println("Introduce el segundo numero: ");
		double numero2 = reader.nextDouble();

		if(numero1 > numero2)
		{
			System.out.println("El numero mayor es: " + numero1);
		}else if (numero2 > numero1)
		{
			System.out.println("El numero mayor es: " + numero2);
		}else{
			System.out.println("Los dos numeros son iguales");
		}

		


	}

}
