package AEA1;
import java.util.Scanner;

public class Descuentos {
	public static void main (String[] args) {
	Scanner	lector = new Scanner(System.in);
	double total = 0; 
	double descuento = 0.15; 

	System.out.println("Quin es el preu del seu producte?");
	double preuintroduit = lector.nextDouble() ;

		if (preuintroduit >= 95) {
			total = preuintroduit - (preuintroduit * descuento);
			System.out.println("El descompte de aquest preu es " + (preuintroduit * descuento));
			System.out.println ("El preu amb descompte es " + total + " euros");
		} else if (preuintroduit < 95)
			System.out.println("No se aplicarà cap descompte, no arriba al mínim requerit, el preu final es: " + preuintroduit + " euros");
		
		}
	}
