package AEA1;
import java.util.Scanner;

public class TaulaMultiplicarReves {
	public static void main (String[] args) {
		Scanner	lector = new Scanner(System.in);
	
	int numINTRO = 0;
	int multip = 10; //ara comença amb 10, no 1


	System.out.println("Introduzca el número que desea multiplicar: ");
	numINTRO = lector.nextInt();	

	while (multip >= 1){
		
		System.out.println(numINTRO + " * " + multip + " = " + (numINTRO * multip));
		multip--; //resta 1 número a la variable multip
	}
	System.out.println("Esta es la tabla de " + numINTRO);




	}
}	