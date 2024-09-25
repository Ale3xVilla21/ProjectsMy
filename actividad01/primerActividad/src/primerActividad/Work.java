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

		System.out.println("La longitud de la circunferencia es: " + radio * 2 * Math.PI);
		System.out.println("El area del circulo es: " + Math.PI * Math.pow(radio, 2));
		System.out.println("El volumen de la esfera es: " + 4 / 3 * Math.PI * Math.pow(radio, 3));
		System.out.println();

		System.out.println("Actividad 6");
		System.out.println();
		reader = new Scanner(System.in);

		System.out.println("Introduzca el precio del articulo: ");
		double precio = reader.nextDouble();

		System.out.println("Introduzca el precio de venta real: ");
		double venta = reader.nextDouble();

		double descuento = ((precio - venta) / precio) * 100;

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
		int number1 = reader.nextInt();

		System.out.println("Introduzca el segundo numero: ");
		int number2 = reader.nextInt();

        //Usando la clase Math.min y Math.max.
		int menor = Math.min(number1, number2);
		int mayor = Math.max(number1, number2);

		System.out.println("Los numeros en orden ascendente son: " + menor + "; " + mayor);
		System.out.println();

		System.out.println("Actividad 9");
		System.out.println();
		reader = new Scanner(System.in);

		System.out.println("Introduce el primer numero: ");
		int numero1 = reader.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		int numero2 = reader.nextInt();

		int mayor1 = Math.max(numero1, numero2);

		System.out.println("El mayor numero es: " + mayor1);
		System.out.println("¿Los dos numeros son iguales? \n" + (numero1 == numero2));
		System.out.println();

		System.out.println("Actividad 10");
		System.out.println();
		reader = new Scanner(System.in);

		System.out.println("Introduzca el primer numero: ");
		int n1 = reader.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		int n2 = reader.nextInt();
		System.out.println("Introduzca el tercer numero: ");
		int n3 = reader.nextInt();

		int mayor2 = Math.max(n1, Math.max(n2, n3));

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

		/*if(numB != 0)
		{
			double div2 = numA / numB;
			System.out.println("Su division es: " + div2);
		}else
		{
			System.out.println("Incorrecto: No se puede dividir por cero.");
		}*/
		System.out.println();

		System.out.println("Ejercicio 12");
		System.out.println();
		reader = new Scanner(System.in);

		System.out.println("Introduzca el primer numero: ");
		int primer = reader.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		int segundo = reader.nextInt();

		int mayor3 = Math.max(primer, segundo);

		System.out.println("El numero mayor es: " + mayor3);
		System.out.println();

		System.out.println("Ejercicio 13");
		System.out.println();
		System.out.println("Ingrese el numero: ");
		double uno = reader.nextDouble();

		/*if(uno >= 0)
		{
			System.out.println("El numero es positivo.");
		}else
		{
			System.out.println("El numero es negativo.");
		}
		System.out.println();*/
		reader.close();
	}//main
}//class
