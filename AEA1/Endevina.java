package AEA1;
import java.util.Scanner;
public class Endevina {
	public static void main (String[] args) {
		Scanner	lector = new Scanner(System.in);
		int max_intentos = 3;
		int intento = 0;
		int NumAleatori = (int)(Math.random() * 10) + 1;
		boolean JuegoTerminado = false;


		System.out.println("Adivina cuál es el número secreto entre 1 y 10 ");
		
		while (!JuegoTerminado && intento < max_intentos) {
			System.out.println("Prueba a adivinar: ");
			int IntentoINTRO = lector.nextInt();
			intento++;

			if (IntentoINTRO == NumAleatori){
				System.out.println("Has acertado!");
				JuegoTerminado = true;
			} else {
				if (IntentoINTRO != NumAleatori){
					System.out.println("No era ese, prueba de nuevo... Llevas "+ intento + " intentos.");
				}
			}

		if (intento==max_intentos){
			System.out.println("No lo has conseguido, se termina el juego.");
		}



		}
	
		
		

					









}	
	}