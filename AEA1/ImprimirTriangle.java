package AEA1;
import java.util.Scanner;

public class ImprimirTriangle {
	public static void main (String[] args) {
		Scanner	lector = new Scanner(System.in);

		int i = 0;
		int j = 0;

		for (i = 1; i <= 5; i++){
			for (j = 1; j <= i; j++){
				System.out.print(j + " ");

			}
			System.out.println();

		}		


}	
	}