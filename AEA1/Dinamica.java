package AEA1;
import java.util.Scanner;

public class Dinamica  {
	public static void main (String[] args) {
	Scanner	teclado = new Scanner(System.in);

	System.out.println("Escribe un número:");
		double n1= teclado.nextDouble();
	System.out.println("Escribe otro número:");
		double n2= teclado.nextDouble();	
	System.out.println("El resultado final de la multiplicación es " + n1 * n2 );	
	}
	
}