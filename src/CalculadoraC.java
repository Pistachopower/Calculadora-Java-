import java.util.Scanner;

/**
 * 
 * @author Nelson Galicia
 * @version 1.0
 * @since 22/12/2021
 *
 */

public class CalculadoraC {

	public static void main(String[] args) {
		
		double num1, num2, result;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el primer valor: ");
		num1 = sc.nextDouble();

		System.out.println("Introduce el segundo valor: ");
		num2 = sc.nextDouble();

		System.out.println("El resultado de la suma es: " + suma(num1,num2));
		
		System.out.println("El resultado de la resta es: " + resta(num1,num2));
		
		System.out.println("El resultado de la multiplicación es: " +multiplicacion(num1,num2));
		
		System.out.println("El resultado de la división es: " +division(num1,num2));

	}

	
	
	/**
	 * Método suma
	 * @param num1 y num2 son los valores que van a entrar por teclado
	 * @return Suma de dos numeros 
	 * 
	 */
	public static double suma (double num1, double num2) {
		
		return num1+num2;
		
	}
	
	/**
	 * Metodo resta 
	 * @param num1 y num2 son los valores que van a entrar por teclado
	 * @return Resta de dos numeros 
	 */
	
	public static double resta (double num1, double num2) {
		
		return num1-num2;
		
	}
	
	/**
	 * Metodo multiplicar
	 * @param num1 y num2 son los valores que van a entrar por teclado
	 * @return Multiplicacion de dos numeros 
	 */
	
	public static double multiplicacion (double num1,double num2) {
		return num1*num2;
		
	}
	
	
	/**
	 * Metodo división
	 * @param num1 y num2 son los valores que van a entrar por teclado
	 * @return Multiplicacion de dos numeros 
	 */
	
	public static double division (double num1,double num2 ) {
		return num1/num2;
		
	}
	
}
