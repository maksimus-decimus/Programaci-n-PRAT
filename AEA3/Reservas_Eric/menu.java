package Reservas_Eric;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {

    public void Mostrar_menu(){
        System.out.println("\nMenú:");
        System.out.println("1. Mostrar allotjaments disponibles");
        System.out.println("2. Reservar allotjament");
        System.out.println("3. Alliberar allotjament");
        System.out.println("4. Buscador");
        System.out.println("5. Sortir");
        System.out.println("--------------------");
        System.out.println("6. ADMINISTRADOR: AFEGIR NOU ALLOTJAMENT");
        System.out.println("--------------------");
        System.out.print("\nTria una opció: ");
    }

    public void menu_buscador(){
        System.out.println("\n1. Buscar allotjaments amb preu menor a X");
        System.out.println("2. Buscar allotjaments amb preu major a X");
        System.out.println("3. Buscar allotjaments amb cuina");
        System.out.println("4. Buscar allotjaments amb piscina o jardí");
        System.out.print("Tria una opció: ");

        
    }
    
    public void mostrar_disponibles(Allotjament[] allotjaments){
        
        for (Allotjament a : allotjaments) {
            System.out.println();
            if (a.isDisponibilitat()) a.mostrarInformacio();
            
        }
    }

    public void reservarAllotjament(Allotjament[] allotjaments, Scanner sc) {
        System.out.print("Introdueix el nom de l'allotjament a reservar: ");
        String nom = sc.next();
        for (Allotjament a : allotjaments) {
            if (a.getNom().equalsIgnoreCase(nom)) {
                a.reservar();
            }
        }
    }

    public void alliberarAllotjament(Allotjament[] allotjaments, Scanner sc) {
        System.out.print("Introdueix el nom de l'allotjament a alliberar: ");
        String nom = sc.next();
        for (Allotjament a : allotjaments) {
            if (a.getNom().equalsIgnoreCase(nom)) {
                a.alliberar();
            }
        }
    }

    public void buscar_PreuMenor(Allotjament[] allotjaments, Scanner sc) {
        System.out.print("Introdueix el preu a buscar: ");
        double preu = sc.nextDouble();
        for (Allotjament a : allotjaments) {
            if (a.getPreuNit() <= preu && a.isDisponible()) {
                System.out.println();
                a.mostrarInformacio();
            }
        }
    }

    public void buscar_PreuMajor(Allotjament[] allotjaments, Scanner sc) {
        System.out.print("Introdueix el preu a buscar: ");
        double preu = sc.nextDouble();
        for (Allotjament a : allotjaments) {
            if (a.getPreuNit() >= preu && a.isDisponible()) {
                System.out.println();
                a.mostrarInformacio();
            }
        }
    }

    public void buscar_Cuina(Allotjament[] allotjaments) {
        for (Allotjament a : allotjaments) {
            if (a instanceof Apartament && ((Apartament) a).isTeCuina()) {
                a.mostrarInformacio();
            }
        }
    }

    
    public void buscar_PiscinaJardi(Allotjament[] allotjaments) {
        for (Allotjament a : allotjaments) {
            if (a instanceof CasaRural && (((CasaRural) a).isTePiscina() || ((CasaRural) a).isTeJardi())) {
                a.mostrarInformacio();
            }
        }
    }
    
    public static void afegir_Allotjament(ArrayList<Allotjament> allotjaments, Scanner sc) {
        System.out.println("Quin tipus d'allotjament vols afegir? (1: Habitació, 2: Apartament, 3: Casa Rural)");
        int tipus = sc.nextInt();
        sc.nextLine(); //consumir salt de línia

        System.out.print("Nom: "); //Afegir totes les dades de les constructores
        String nom = sc.nextLine();
        System.out.print("Capacitat: ");
        int capacitat = sc.nextInt();
        System.out.print("Disponible (true/false): ");
        boolean disponible = sc.nextBoolean();
        
        double preuNit;

        if (tipus == 1) {
            preuNit = 50;
            System.out.print("Nombre de llits: ");
            int numLlits = sc.nextInt();
            allotjaments.add(new Habitacio(nom, capacitat, disponible, preuNit, numLlits));
        } else if (tipus == 2) {
            preuNit = 100;
            System.out.print("Nombre de habitacions: ");
            int numhabit = sc.nextInt();
            System.out.print("Té cuina (true/false): ");
            boolean teCuina = sc.nextBoolean();
            allotjaments.add(new Apartament(nom, capacitat, disponible, preuNit, numhabit, teCuina));
        } else if (tipus == 3) {
            preuNit = 150;
            System.out.print("Té piscina (true/false): ");
            boolean tePiscina = sc.nextBoolean();
            System.out.print("Té jardí (true/false): ");
            boolean teJardi = sc.nextBoolean();
            allotjaments.add(new CasaRural(nom, capacitat, disponible, preuNit, tePiscina, teJardi));
        }
        System.out.println("----------------------------------");
        System.out.println("Allotjament afegit correctament.");
        System.out.println("----------------------------------");
    }
}
