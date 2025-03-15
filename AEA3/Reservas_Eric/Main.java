package Reservas_Eric;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        menu menu = new menu();
        boolean programa = true;
        Allotjament[] allotjaments = new Allotjament[5];

        allotjaments[0] = new Apartament("Apartamento A", 2, true, 50, 2, true);
        allotjaments[1] = new CasaRural("Casa Rural B", 4, false, 100, true, false);
        allotjaments[2] = new Habitacio("Habitació C", 2, true, 20, 2);
        allotjaments[3] = new CasaRural("Casa Rural D", 6, true, 100, true, false);
        allotjaments[4] = new CasaRural("Casa Rural Pobre", 8, true, 100, false, false);

        Scanner sc = new Scanner(System.in);

        int opcio;

        while (programa) {
            
            menu.Mostrar_menu();
            opcio = sc.nextInt();

            if (opcio == 1) {
               
                for (Allotjament a : allotjaments) {
                    System.out.println();
                    if (a.isDisponible()) a.mostrarInformacio();
                }
            } else if (opcio == 2) {       
                
                System.out.print("Introdueix el nom de l'allotjament a reservar: ");
                String nom = sc.next();
                for (Allotjament a : allotjaments) {
                    if (a.getNom().equalsIgnoreCase(nom)) {
                        a.reservar();
                    }
                }

            } else if (opcio == 3) {
            
                System.out.print("Introdueix el nom de l'allotjament a alliberar: ");
                String nom = sc.next();
                for (Allotjament a : allotjaments) {
                    if (a.getNom().equalsIgnoreCase(nom)) {
                        a.alliberar();
    
                    }
                }
            } else if (opcio == 4) {
            
                menu.menu_buscador();
                int subOpcio = sc.nextInt();

                if (subOpcio == 1) {
                    System.out.print("Introdueix el preu a buscar: ");
                    double preu = sc.nextDouble();

                    for (Allotjament a : allotjaments) {
                        if (a.getPreuNit() <= preu) {
                            if (a.isDisponible()) {
                                System.out.println();
                                a.mostrarInformacio();
                            }       
                        }
                    }

                } else if (subOpcio == 2) {
                    for (Allotjament a : allotjaments) {
                        if (a.getPreuNit() >= preu) {
                            if (a.isDisponible()) {
                                System.out.println();
                                a.mostrarInformacio();
                            } 
                        }
                    }
                } else if (subOpcio == 3) {
                    for (Allotjament a : allotjaments) {
                        if (a instanceof Apartament && ((Apartament) a).isTeCuina()) {
                            a.mostrarInformacio();
                        }
                    }
                } else if (subOpcio == 4) {
                    for (Allotjament a : allotjaments) {
                        if (a instanceof CasaRural && (((CasaRural) a).isTePiscina() || ((CasaRural) a).isTeJardi())) {
                            a.mostrarInformacio();
                        }
                    }
                }


            } else if (opcio == 5) {
                programa = false;
            } 
        }
    }
}

