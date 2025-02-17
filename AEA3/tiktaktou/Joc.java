package tiktaktou;
import java.util.Scanner;


public class Joc {

    private Tauler tauler;
   
    private char jugadorActual = 'X';

    private Scanner scanner;

    private boolean guanyador = false;

    Scanner lector = new Scanner(System.in);

    public void començarJoc(){

        Tauler tauler = new Tauler();
        System.out.println("BENVINGUTS A TIC TAC TOE: ");

        tauler.MostrarTauler();

        FerTorn();  
        

    }

    
    public void FerTorn(){

        while (!guanyador){
            System.out.println("ES EL TORN DELS: " + jugadorActual);
            System.out.println("Posa les posicions que vols marcar: ");

            tauler.marcarCasella(lector.nextInt(), lector.nextInt(), jugadorActual);

            ComprovarGuanyador();
        }
        
        

    }
    
    public void canviarJugador(){

        if (jugadorActual == 'X'){
            jugadorActual = 'O';
        } else {
            jugadorActual = 'X';
        }

        System.out.println("Canviant a.... " + jugadorActual);
    }
    
    public void ComprovarGuanyador(){

        if (tauler.haGuanyat(jugadorActual)){
            System.out.println("Les "+ jugadorActual +" han guanyat!");
            tauler.MostrarTauler();
            guanyador = true;
            
        } if (tauler.taulerPle()){
            System.out.println("No ha guanyat cap jugador");
            tauler.MostrarTauler();
            
        }
        
        else {
            canviarJugador();
            tauler.MostrarTauler();
        }



    }
    // consturctora
    //comenzar joc
    //gestioanr torn
    //cambiar jugador






}
