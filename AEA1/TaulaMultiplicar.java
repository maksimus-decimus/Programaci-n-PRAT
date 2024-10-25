package AEA1;
import java.util.Scanner;

public class TaulaMultiplicar {
	public static void main (String[] args) {
		Scanner	lector = new Scanner(System.in);
	
	int numINTRO = 0;
	int multip = 1;
// Variables per organitzar les multiplicacions 

	System.out.println("Introduzca el número que desea multiplicar: ");
	numINTRO = lector.nextInt();	

	while (multip <= 10){ //mentres no arribi al número 10, que repeteixi les operacions introduides
		
		System.out.println(numINTRO + " * " + multip + " = " + (numINTRO * multip));
		multip++; //això suma 1 a la variable
	}
	System.out.println("Esta es la tabla de " + numINTRO);

		

		


 










	}
}	