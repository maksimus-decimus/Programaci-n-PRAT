package tiktaktou;
import java.util.Scanner;


public class Joc {

    private lectorterminal s = new lectorterminal();
    
    private Tauler tauler;
   
    private char jugadorActual = 'X';

    private boolean ple = false;

    private boolean guanyador = false;

    private int mida = 0;

    Scanner lector = new Scanner(System.in);

    public void començarJoc(){

        
        System.out.println("BENVINGUTS A TIC TAC TOE: ");
        System.out.println("Introdueix la mida de la matriu: ");
        mida = s.LeerInt();
        
        
        tauler = new Tauler(mida);
        EscollirJugador();
        tauler.MostrarTauler();

        FerTorn();  
        

    }

    public void EscollirJugador(){
        boolean jugadorEscolt = false;
        while (!jugadorEscolt){
            System.out.println("Quin jugador comença? (X / O)");
            String jugadorEscoltor = lector.nextLine();
            if (jugadorEscoltor.equalsIgnoreCase("X")){
                jugadorActual = 'X';
                jugadorEscolt = true;
            } else if (jugadorEscoltor.equalsIgnoreCase("O")){
                jugadorActual = 'O';
                jugadorEscolt = true;
            }

        }

        
    
    }


    public void FerTorn(){

        

        while (!guanyador && !ple){


            System.out.println("");
            System.out.println("ES EL TORN DELS: " + jugadorActual);
            System.out.println("Posa les posicions que vols marcar: ");

            System.out.println("Fila:");
            int fila = s.LeerInt();

            System.out.println("Columna:");
            int columna = s.LeerInt();
            System.out.println("");

            tauler.marcarCasella(fila, columna, jugadorActual);
            
            ComprovarGuanyador();

            if (guanyador || ple ){
                break;
            }

            canviarJugador();     
               
        }
        
        if (guanyador){
            System.out.println("");
            System.out.println("=========================");
            System.out.println("HAN GUANYAT ELS: " + jugadorActual);
            System.out.println("=========================");
            tauler.MostrarTauler();
            
        } 
        
        

        if (ple && !guanyador){
            System.out.println("=========================");
            System.out.println("TAULER PLE, CAP JUGADOR HA GUANYAT");
            System.out.println("=========================");
            tauler.MostrarTauler();
            
        }
    }
    
    public void canviarJugador(){

        if (jugadorActual == 'X'){
            jugadorActual = 'O';
        } else {
            jugadorActual = 'X';
        }

        System.out.println("Canviant a.... " + jugadorActual);
        tauler.MostrarTauler();
    }
    
    public boolean ComprovarGuanyador(){
        if (tauler.haGuanyat(jugadorActual)){
            guanyador = true;
            return true;
        } 
        
        if (tauler.taulerPle()){
            ple = true;
            return true;
            
        }
        
        return false;
    }
    // consturctora
    //comenzar joc
    //gestioanr torn
    //cambiar jugador






}
