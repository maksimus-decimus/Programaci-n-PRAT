package AEA1;
import java.util.Scanner;

public class TresNombres {
	public static void main (String[] args) {
	Scanner	teclado = new Scanner(System.in);

	System.out.println("Escribe un numero");
		double n1= teclado.nextDouble();
	System.out.println("Escribe otro numero");
		double n2= teclado.nextDouble();
	System.out.println("Escribe un ultimo numero");
		double n3= teclado.nextDouble();	
	System.out.println("El resultado final es " + n1 * n2 * n3);	
	}
	
}