package AEA1;
import java.util.Scanner;

public class SeleccioArea {
	public static void main (String[] args) {
		Scanner	teclado = new Scanner(System.in);
		boolean figuraSI = false;
		double area = 0;
		String figuraNombre = "";

			
		
		//////////////////////////////////////////////////////////////////////////////////////////////

		
		while (!figuraSI) {

			System.out.println("\nDe las siguientes figuras...¿De cuál desea calcular el área?:");
			System.out.println("Escriba el número de la figura:");
			System.out.println("\n1.Triángulo\n2.Trapecio\n3.Círculo\n4.Rombo\n5.Paralelogramo\n");

			String figura = teclado.nextLine();

			if (figura.equalsIgnoreCase("Triangulo") || figura.equals("Triángulo")) {
				figuraSI = true;
				System.out.println("Introduce la base del triangulo");
				double btriangulo = teclado.nextDouble();

				System.out.println("Introduce la altura del triangulo");
				double htriangulo = teclado.nextDouble();

				area = (btriangulo * htriangulo) / 2;
				figuraNombre = "triángulo";

				
			} else if (figura.equalsIgnoreCase("Trapecio")) {
				figuraSI = true;
				System.out.println("Introduzca la base mayor del trapecio:");
				double bmayortrapecio = teclado.nextDouble();

				System.out.println("Introduzca la base menor del trapecio:");
				double bmenortrapecio = teclado.nextDouble();

				System.out.println("Introduzca la altura del trapecio:");
				double alturatrapecio = teclado.nextDouble();

				area = ((bmayortrapecio + bmenortrapecio) * alturatrapecio) / 2;
				figuraNombre = "trapecio";

			} else if (figura.equalsIgnoreCase("Circulo")) {
				figuraSI = true;
				System.out.println("Introduzca el radio del círculo:");
				double radio = teclado.nextDouble();
				area = (3.1416) * (radio*radio);
				figuraNombre = "círculo";	
				

			} else if (figura.equalsIgnoreCase("Rombo")) {
				figuraSI = true;
				System.out.println("Introduzca la diagonal mayor del rombo:");
				double dMayorRombo = teclado.nextDouble();

				System.out.println("Introduzca la diagonal menor del trapecio:");
				double dMenorRombo= teclado.nextDouble();

				area = (dMayorRombo * dMenorRombo) / 2; 
				figuraNombre = "rombo";

			} else if (figura.equalsIgnoreCase("Paralelogramo")) {
				figuraSI = true;
				System.out.println("Introduzca la base del paralelogramo: ");
				double bParalelo = teclado.nextDouble();

				System.out.println("Introduzca la altura del paralelogramo: ");
				double aParalelo = teclado.nextDouble();

				area = (bParalelo * aParalelo);
				figuraNombre = "paralelogramo";

		} else {
			System.out.print("\033[H\033[2J");
			System.out.println("No has escrito ninguna palabra válida, por favor, consulte con su oculista si necesita asistencia.");
			figuraSI = false;
		}			
	  }
		System.out.println("El resultado del " + (figuraNombre)+ " es " + area );

	}
}

