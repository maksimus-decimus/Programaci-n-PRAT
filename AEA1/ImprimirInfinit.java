package AEA1;
import java.util.Scanner;

public class ImprimirInfinit {
	public static void main (String[] args) {
		Scanner	lector = new Scanner(System.in);

		int i = 0;
		int j = 0;

		System.out.println("Introdueix un nom: ");
		int nombreintro = lector.nextInt();


		for (i = 1; i <= nombreintro ; i++){
			for (j = 1; j <= i; j++){
				System.out.print(j + " ");

			}
			System.out.println();

		}		

	}
}	
	