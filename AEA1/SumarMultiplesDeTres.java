package AEA1;
import java.util.Scanner;

public class SumarMultiplesDeTres {
	public static void main (String[] args) {
		Scanner	lector = new Scanner(System.in);
	
	int multiple = 3;
	int cero = 0;
	// fico 2 variables per organitzar com es farà la suma

	System.out.println("Introduce hasta qué valor deseas sumar los múltiples de 3:");
	int numeroINTRO = lector.nextInt();

		//mentres que la variable cero no arribi a una aproximació del nombre introduit, doncs que repeteixi el loop 
		while (cero <=numeroINTRO){
			System.out.println("Añadimos "+ cero + " . . .");
			cero = (cero + multiple);

			//vull que es quedi amb un número fixe (posiblement aquesta línia sobra, pero funciona)
		} if (cero <= cero){
			cero = cero;
		}

	System.out.println("El resultado final es " + cero);
					









}	
	}
