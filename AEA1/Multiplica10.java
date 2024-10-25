package AEA1;
import java.util.Scanner;

public class TaulaMultiplicar {
	public static void main (String[] args) {
		Scanner	lector = new Scanner(System.in);
	
	int numINTRO = 0;
	int multip = 0;


	System.out.println("Introduzca el número que desea multiplicar: ");
	numINTRO = lector.nextInt();	

	while (multip <= 10){
		multip++;
		System.out.println(numINTRO + " * " + multip + " = " + (numINTRO * multip));
	}
	System.out.println("Esta es la tabla de " + numINTRO);

		

		













	}
}	