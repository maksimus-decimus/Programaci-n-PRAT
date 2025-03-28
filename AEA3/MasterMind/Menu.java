package MasterMind;
import java.util.Scanner;
import static MasterMind.CodeGenerator.*;
import static MasterMind.Feedback.*; //importar de Feedback

public class Menu {

    CodeGenerator codeGenerator = new CodeGenerator();
    Feedback feedback = new Feedback();
    Player player = new Player();


    public final static String ENCERTAT = "OOO";
    public static String secret = "";
    public static String resposta = "";

    //Mètodes associats al problema general
    public static void main(String[] args) {
        Menu programa = new Menu();
        programa.inici();
    }

    public void inici() {
        secret = codeGenerator.generarParaulaSecreta();
        boolean encertat = false;
        while (!encertat) {
            resposta = player.preguntarResposta();
            encertat = feedback.resoldreResposta(secret, resposta);
        }
    }

}
