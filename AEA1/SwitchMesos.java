package AEA1;
import java.util.Scanner;

public class SwitchMesos {
	public static void main (String[] args) {
		Scanner	lector = new Scanner(System.in);
		

		System.out.println("¿De qué mes deseas saber los días? [1-12]");
		int mes = lector.nextInt();
		switch(mes) {

			case  2:
				System.out.println("tiene 28 o 29 días.");
				break;

			case 4: case 6: case 11:
				System.out.println("tiene 30 días.");
				break;
			case 1: case 3: case 5: case 7: case 8:case 10: case 12:
				System.out.println("tiene 31 días.");
				break;

			default:
				System.out.println("Introduce un mes válido!");			
		}

		









	}
}	