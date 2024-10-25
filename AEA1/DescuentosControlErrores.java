package AEA1;
import java.util.Scanner;

public class DescuentosControlErrores {
	public static void main (String[] args) {
	Scanner	lector = new Scanner(System.in);

	double totaldescuento = 0; 
	double descuento = 8; 
	double compraMin = 100;
	double descomptMax = 10;
	double preufinal = 0;	

	System.out.println("Quin es el preu del seu producte?");
	double preuintroduit = lector.nextDouble();

		if (preuintroduit > 100) {
			if (preuintroduit >= compraMin) {

				totaldescuento = preuintroduit * descuento / 100;
				
				if (totaldescuento > descomptMax) {

					totaldescuento = descomptMax;

				} else if (preuintroduit < 100){
					System.out.println("No arriba al mínim per aplicar el descompte, total a pagar " + preuintroduit + "euros");
				} 

				preufinal = preuintroduit - totaldescuento; 
					
			}
					System.out.println("El descompte aplicat és de " + totaldescuento + "euros");
					System.out.println("En total, s'haurà de pagar " + preufinal + "euros");
		}	

		else {

			System.out.println("No se aplicarà cap descompte, no arriba al mínim requerit o es negatiu");
		}		

}	
	}
		
	
