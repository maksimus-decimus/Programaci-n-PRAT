package Reservas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Habitacion h = new Habitacion("Habitación Hospitalet ", 2, true, 10, 2);
        //h.Mostrar_informacio();
        Apartament a = new Apartament("Apartamento B", 4, false, 10, 3, false);
        //a.Mostrar_informacio();
        Casa c = new Casa("Casa pueblo", 5, true, 20, true, false);
        //c.Mostrar_informacio();
        Habitacion h1 = new Habitacion("Cuarto Pirulo", 4, true, 20, 2);

       List<Allotjament> allotjaments = new ArrayList<>();
        allotjaments.add(h);
        allotjaments.add(a);
        allotjaments.add(c);
        allotjaments.add(h1);


        Scanner lector = new Scanner(System.in);
        String opcion;

        

            
        do {
            System.out.println("MENÚ:");
            System.out.println("1. Mostrar allotjaments disponibles");
            System.out.println("2. Reservar allotjament");
            System.out.println("3. Alliberar allotjament");
            System.out.println("4. Sortir");
            System.out.println("Tria una opció: ");

            opcion = lector.nextLine();
        
            switch (opcion) {
                case "1":
                    for (Allotjament all : allotjaments) {
                        if (all.isDisponible()) {
                            all.Mostrar_informacio();
                        }
                    }
                    break;
                case "2":
                    System.out.println("Introdueix el nom de l'allotjament a reservar: ");
                    String nom = lector.nextLine();
                    for (Allotjament all : allotjaments) {
                        if (all.getNom().equalsIgnoreCase(nom)) {
                            if (all.reservar()) {
                            } else {
                                System.out.println("----");
                            }
                        }
                    }
                    break;
                case "3":
                    System.out.println("Introdueix el nom de l'allotjament a alliberar: ");
                    nom = lector.nextLine();
                    for (Allotjament all : allotjaments) {
                        if (all.getNom().equalsIgnoreCase(nom)) {
                            all.alliberar();
                        }
                    }
                    break; 
            }
        } while (!opcion.equals("4"));
            System.out.println("Sortint...");
            System.out.println();
    }

}
