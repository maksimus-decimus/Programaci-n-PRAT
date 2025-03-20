package Reservas_Eric_Ext;

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
        System.out.println("7. Reserva ràpida");
        System.out.print("\nTria una opció: ");
    }

    public void menu_buscador(){
        System.out.println("\n1. Buscar allotjaments amb preu menor a X");
        System.out.println("2. Buscar allotjaments amb preu major a X");
        System.out.println("3. Buscar allotjaments amb cuina");
        System.out.println("4. Buscar allotjaments amb piscina o jardí");
        System.out.println("5. Mostar allotjaments de major a menor preu");
        System.out.println("6. Mostar allotjaments de menor a major preu");
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


    public void reserva_rapida(Allotjament[] allotjaments, Scanner sc) {
        System.out.println("Introdueix quants dies vols reservar: ");
        int dies = sc.nextInt();
        System.out.println("Introdueix el nombre de persones: ");
        int persones = sc.nextInt();
        System.out.println("Introdueix el preu màxim que vols pagar: ");
        double preu = sc.nextDouble();
        System.out.println("Introdueix si vols cuina (true/false): ");
        boolean teCuina = sc.nextBoolean();
        System.out.println("Introdueix si vols piscina (true/false): ");
        boolean tePiscina = sc.nextBoolean();
        System.out.println("Introdueix si vols jardí (true/false): ");
        boolean teJardi = sc.nextBoolean();

        for (Allotjament a : allotjaments) {
            boolean coincideix = true;
            if (a instanceof CasaRural) {
                CasaRural cr = (CasaRural) a;
                coincideix = coincideix && cr.isTePiscina() == tePiscina && cr.isTeJardi() == teJardi;
            }
            if (a instanceof Apartament) {
                Apartament ap = (Apartament) a;
                coincideix = coincideix && ap.isTeCuina() == teCuina;
            }
            if (coincideix && a.isDisponibilitat() && a.getCapacitat() >= persones) {
                double costTotal = calcularCostTotal(a, dies);
                a.mostrarInformacio();
                System.out.println("El cost total de la reserva és: " + costTotal + " euros.");
                System.out.print("Vols confirmar la reserva? (true/false): ");
                boolean confirmar = sc.nextBoolean();
                if (confirmar) {
                    a.reservar();
                    System.out.println("Allotjament reservat correctament.");
                } else {
                    System.out.println("Reserva cancel·lada.");
                }
                return;
            }
        }
        System.out.println("No s'ha trobat cap allotjament disponible amb aquestes característiques.");
    }
    
        private double calcularCostTotal(Allotjament allotjament, int dies) {
        return allotjament.getPreuNit() * dies;
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

    public void Major_a_menor(Allotjament[] allotjaments) {
        for (int i = 0; i < allotjaments.length; i++) {
            for (int j = i + 1; j < allotjaments.length; j++) {
                if (allotjaments[i].getPreuNit() < allotjaments[j].getPreuNit()) {
                    Allotjament aux = allotjaments[i];
                    allotjaments[i] = allotjaments[j];
                    allotjaments[j] = aux;
                }
            }
        }
        for (Allotjament a : allotjaments) {
            if (a.isDisponible()) {
                System.out.println();
                a.mostrarInformacio();
            }
        }
    }

    public void Menor_a_major(Allotjament[] allotjaments) {
        for (int i = 0; i < allotjaments.length; i++) {
            for (int j = i + 1; j < allotjaments.length; j++) {
                if (allotjaments[i].getPreuNit() > allotjaments[j].getPreuNit()) {
                    Allotjament aux = allotjaments[i];
                    allotjaments[i] = allotjaments[j];
                    allotjaments[j] = aux;
                }
            }
        }
        for (Allotjament a : allotjaments) {
            if (a.isDisponible()) {
                System.out.println();
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

