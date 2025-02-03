
import java.util.Scanner;

public class SeleccioAreafunciones {
	public static void main (String[] args) {

		SeleccioAreafunciones programa = new SeleccioAreafunciones();
		programa.inici();

	}

	public void inici() {
		
		menu();	
	}

	public void menu() {
		Scanner lector = new Scanner(System.in);
		String figura = "";
		System.out.println("\nDe las siguientes figuras...¿De cuál desea calcular el área?:");
		System.out.println("Escriba el nombre de la figura:");
		System.out.println("\n1.Triángulo\n2.Trapecio\n3.Círculo\n4.Rombo\n5.Paralelogramo\n");
		System.out.println("Si desea salir, escriba 'Salir'.");
		
		selection();
	}

	public void selection() {
		Scanner lector = new Scanner(System.in);
		String figura = "";
		figura = lector.nextLine();

		if (figura.equalsIgnoreCase("Triangulo") || figura.equals("Triángulo")) {
			calculotriangulo();
			return;
		
		} else if (figura.equalsIgnoreCase("Trapecio")) {
			calculotrapezio();
			return;
		} else if (figura.equalsIgnoreCase("Circulo")) {
			calculocirculo();
			return;
		} else if (figura.equalsIgnoreCase("Rombo")) {
			calculorombo();
			return;
		} else if (figura.equalsIgnoreCase("Paralelogramo")) {
			calculoparalelogramo();
			return;
		} else if (figura.equalsIgnoreCase("Salir")) {
			salir();
			
		
		}
		else {
			System.out.println("No has escrito ninguna palabra válida, por favor, consulte con su oculista si necesita asistencia.");
			lector.nextLine();
			return;
			
		}
	}
	
	public void calculotriangulo() {
		Scanner lector = new Scanner(System.in);
		double area = 0;
		String figuraNombre = "";
		

		System.out.println("Introduce la base del triangulo");
		double btriangulo = lector.nextDouble();

		System.out.println("Introduce la altura del triangulo");
		double htriangulo = lector.nextDouble();

		area = (btriangulo * htriangulo) / 2;
		figuraNombre = "triángulo";
		System.out.println("El resultado del " + (figuraNombre)+ " es " + area );
		menu();
	}

	public void calculotrapezio() {
		Scanner lector = new Scanner(System.in);
		double area = 0;
		String figuraNombre = "";
		

		System.out.println("Introduzca la base mayor del trapecio:");
		double bmayortrapecio = lector.nextDouble();

		System.out.println("Introduzca la base menor del trapecio:");
		double bmenortrapecio = lector.nextDouble();

		System.out.println("Introduzca la altura del trapecio:");
		double alturatrapecio = lector.nextDouble();

		area = ((bmayortrapecio + bmenortrapecio) * alturatrapecio) / 2;
		figuraNombre = "trapecio";
		System.out.println("El resultado del " + (figuraNombre)+ " es " + area );
		menu();
	}

	public void calculocirculo() {
		Scanner lector = new Scanner(System.in);
		double area = 0;
		String figuraNombre = "";
		

		System.out.println("Introduzca el radio del círculo:");
		double radio = lector.nextDouble();
		area = (3.1416) * (radio*radio);
		figuraNombre = "círculo";	
		System.out.println("El resultado del " + (figuraNombre)+ " es " + area );
		menu();
	}

	public void calculorombo() {
		Scanner lector = new Scanner(System.in);
		double area = 0;
		String figuraNombre = "";
		

		System.out.println("Introduzca la diagonal mayor del rombo:");
		double dMayorRombo = lector.nextDouble();

		System.out.println("Introduzca la diagonal menor del trapecio:");
		double dMenorRombo= lector.nextDouble();

		area = (dMayorRombo * dMenorRombo) / 2; 
		figuraNombre = "rombo";
		System.out.println("El resultado del " + (figuraNombre)+ " es " + area );
		menu();
	}

	public void calculoparalelogramo() {
		Scanner lector = new Scanner(System.in);
		double area = 0;
		String figuraNombre = "";
		

		System.out.println("Introduzca la base del paralelogramo: ");
		double bParalelo = lector.nextDouble();

		System.out.println("Introduzca la altura del paralelogramo: ");
		double aParalelo = lector.nextDouble();

		area = (bParalelo * aParalelo);
		figuraNombre = "paralelogramo";
		System.out.println("El resultado del " + (figuraNombre)+ " es " + area );
		menu();
	}
	
	public void salir() {
		System.out.println("Saliendo del programa.");
		System.exit(0);

	}




}







	
	
	
	



