package MasterMind;
import static MasterMind.CodeGenerator.*;
import static MasterMind.Feedback.*;
//Un programa per jugar al MasterMind.

public class MasterMindGame {
    CodeGenerator codeGenerator = new CodeGenerator();
    Feedback feedback = new Feedback();
    Player player = new Player();
    Menu menu = new Menu();
    COM maquina = new COM();

    public final static String ENCERTAT = "OOO";
    public String secret = "";
    public String resposta = "";
    boolean esInfantil = false;

    public static void main(String[] args) {
        MasterMindGame programa = new MasterMindGame();
        HumanPlayer jugador;


        programa.menu.inici();
        
        if (programa.menu.esInfantil) {
            jugador = new Infantil();
            programa.esInfantil = true; // Actualizar el estado de esInfantil
            
        } else {
            jugador = new Adulto();
            programa.esInfantil = false; // Actualizar el estado de esInfantil
        }
        

        programa.secret = programa.codeGenerator.generarParaulaSecreta(programa.esInfantil);
        System.out.println("DEBUG: " + programa.secret);

        boolean encertatJugador = false;
        boolean encertatMaquina = false;

        while (!encertatJugador && !encertatMaquina) {
            System.out.println("Turno del jugador:");
            programa.resposta = programa.player.preguntarResposta();
            encertatJugador = programa.feedback.resoldreResposta(programa.secret, programa.resposta);

            if (!encertatJugador) {
                System.out.println("Turno de la máquina:");
                encertatMaquina = programa.maquina.intentarAdivinar(programa.secret);
            }
           
        }

        if (encertatJugador) {
            System.out.println("¡Felicidades! Has adivinado la palabra secreta: " + programa.secret);
        } else {
            System.out.println("La máquina ha adivinado la palabra secreta: " + programa.secret);
        }
    }

    
    
}