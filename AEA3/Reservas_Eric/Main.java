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
        //i si no els vols treu els exemples i afegeix els teus allotjaments
        allotjaments.add (new Apartament("Apartamento_A", 2, true, 100, 4, true));
        allotjaments.add (new CasaRural("Casa_B", 4, false, 150, true, false));
        allotjaments.add (new Habitacio("Habitacio_C", 2, true, 50, 5));
        allotjaments.add (new CasaRural("Casa_D", 6, true, 150, false, true));
        allotjaments.add (new CasaRural("Casa_pobre_E", 8, true, 150, false, false));

        

        

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

