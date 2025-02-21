package tiktaktou;
import java.util.Scanner;


public class Joc {

    private lectorterminal s = new lectorterminal();
    
    private Tauler tauler;
   
    private char jugadorActual = 'X';

    private boolean ple = false;

    private boolean guanyador = false;

    

    Scanner lector = new Scanner(System.in);

    public void començarJoc(){

        tauler = new Tauler();
        System.out.println("BENVINGUTS A TIC TAC TOE: ");
        
        
        EscollirJugador();
        tauler.MostrarTauler();

        FerTorn();  
        

    }

    public void EscollirJugador(){
        boolean jugadorEscolt = false;
        while (!jugadorEscolt){
            System.out.println("Quin jugador comença? (X / O)");
            String jugadorEscoltor = lector.nextLine();
            if (jugadorEscoltor.equals("X")){
                jugadorActual = 'X';
                jugadorEscolt = true;
            } else if (jugadorEscoltor.equals("O")){
                jugadorActual = 'O';
                jugadorEscolt = true;
            }

        }

        
    
    }


    public void FerTorn(){

        

        while (!guanyador || !ple){


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
            canviarJugador();  
            
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
    
    public void ComprovarGuanyador(){

        if (tauler.haGuanyat(jugadorActual)){
            guanyador = true;

            
        } if (tauler.taulerPle()){
            ple = true;
            
        }
        
        if (guanyador){
            System.out.println("");
            System.out.println("=========================");
            System.out.println("HAN GUANYAT ELS: " + jugadorActual);
            System.out.println("=========================");
            
        } 
        
        

        if (ple && !guanyador){
            System.out.println("=========================");
            System.out.println("TAULER PLE, CAP JUGADOR HA GUANYAT");
            System.out.println("=========================");
        }


    }
    // consturctora
    //comenzar joc
    //gestioanr torn
    //cambiar jugador






}
