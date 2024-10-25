package AEA1;
import java.util.Scanner;

public class DescuentosControlErrores2 {
	public static void main (String[] args) {
	Scanner	lector = new Scanner(System.in);

	float descuento = 8;
	float descuentoMAX= 10;
	float preuMIN= 100;

	System.out.println("Preu del seu producte?");
	float preu = lector.nextFloat();

		if (preu < 0){
			System.out.println("Incorrecte. Has posat un nombre negatiu?");
		
		} else if (preu < 100){
				System.out.println("No arriba al mínim que es necesita per aplicar el descompte, per tant, el preu a pagar és " + preu + " euros");
 
		} else if (preu >= 100) {
			float descuentoaplicado = (preu * descuento) / 100;

				if (descuentoaplicado > descuentoMAX){

					descuentoaplicado = descuentoMAX;

					float preufinal = (preu - descuentoaplicado);

						System.out.println("El descompte serà de: " + descuentoaplicado + " euros");
						System.out.println("El preu final a pagar serà: " + preufinal  + " euros");
			}		
		} 		
	}  		
}	