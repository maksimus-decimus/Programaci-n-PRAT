package Reservas_Eric;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        menu menu = new menu();
        boolean programa = true;
        double preu;
        int opcio;
        Scanner sc = new Scanner(System.in);
        ArrayList<Allotjament> allotjaments = new ArrayList<>(); //ARRAYlist dels allotjaments
        //llista d'allotjaments d'exemple
        allotjaments.add (new Apartament("Apartamento Hospitalet A", 2, true, 50, 2, true));
        allotjaments.add (new CasaRural("Casa Rural B", 4, false, 100, true, false));
        allotjaments.add (new Habitacio("Habitació C", 2, true, 20, 2));
        allotjaments.add (new CasaRural("Casa Rural D", 6, true, 100, true, false));
        allotjaments.add (new CasaRural("Casa Rural Pobre E", 8, true, 100, false, false));

        

        

        while (programa) {
            // No cal preguntar per el nombre d' allotjaments, pots afegir directament a la llista
            //menu.afegir_Allotjament (opció 6 permeteix fer-ho)

            menu.Mostrar_menu();
            opcio = sc.nextInt();

            if (opcio == 1) {
                menu.mostrar_disponibles(allotjaments.toArray(new Allotjament[0]));
            } else if (opcio == 2) {       
                menu.reservarAllotjament(allotjaments.toArray(new Allotjament[0]), sc);
            } else if (opcio == 3) {
                menu.alliberarAllotjament(allotjaments.toArray(new Allotjament[0]), sc);
            } else if (opcio == 4) {
            
                menu.menu_buscador();
                int subOpcio = sc.nextInt();

                if (subOpcio == 1) {
                    System.out.println();
                    menu.buscar_PreuMenor(allotjaments.toArray(new Allotjament[0]), sc);

                } else if (subOpcio == 2) {
                    System.out.println();
                    menu.buscar_PreuMajor(allotjaments.toArray(new Allotjament[0]), sc);

                } else if (subOpcio == 3) {
                    System.out.println();
                    menu.buscar_Cuina(allotjaments.toArray(new Allotjament[0]));

                } else if (subOpcio == 4) {
                    System.out.println();
                    menu.buscar_PiscinaJardi(allotjaments.toArray(new Allotjament[0]));
                }


            } else if (opcio == 5) {
                programa = false;
                System.out.println("Sortint...");
            } else if (opcio == 6) { // Opció d'admin
                
                menu.afegir_Allotjament(allotjaments,sc);
            }
        }
    }
}

