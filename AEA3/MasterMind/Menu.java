package MasterMind;
import java.util.Scanner;
import MasterMind.MasterMindGame;

public class Menu {
    Scanner lector = new Scanner(System.in);
    boolean esInfantil = false;


    public void inici() {
        System.out.println("Bienvenido al MasterMind!");
        System.out.println("Selecciona un modo de juego:");
        System.out.println("1. Adulto");
        System.out.println("2. Infantil");

        int opcio = lector.nextInt();
        switch (opcio) {
            case 1:
                System.out.println("Modo Adulto seleccionado.");
                esInfantil = false;
                break;
            case 2:
                System.out.println("Modo Infantil seleccionado.");
                esInfantil = true;
                break;
        }
    }
}
