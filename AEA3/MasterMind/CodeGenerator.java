package MasterMind;
import java.util.Scanner;

import MasterMind.Feedback;
import MasterMind.Player;




public class CodeGenerator {

    Feedback feedback = new Feedback();
    Player player = new Player();

    String[] palabras_adulto = {
    "tomate", "cuerpo", "viernes", "camino", "abuelo",
    "velero", "trampa", "raton", "brillo", "cuevas",
    "espuma", "bajada", "subida", "herida", "paredes",
    "remera", "cabina", "lentes", "botana", "planta"
    };

    
    String[] palabras_infantil = {
            "luz", "sol", "mar", "pan", "casa",
            "lago", "pato", "vino", "taza", "flor",
            "tren", "luna", "copa", "silla", "nube",
            "pelo", "mano", "dado", "roca", "vela"
    };
    

    public static int LONG_SECRET = 6;
    public final static String abc = "abcdefghijklmnopqrstuvwxyz";
    public final static String ENCERTAT = "OOO";
    public static String secret = "";
    public static String resposta = "";

    public String generarParaulaSecreta(boolean esInfantil) {
        String[] palabras = esInfantil ? palabras_infantil : palabras_adulto;
        int index = (int) (Math.random() * palabras.length);
        String palabraSeleccionada = palabras[index];
        LONG_SECRET = palabraSeleccionada.length(); // Actualizar la longitud de la palabra secreta
        return palabras[index];

    }

    public char generarLletraAleatoria() {
        long nano = System.nanoTime();
        int index = (int) (nano % abc.length());
        if (index < 0) {
            index += abc.length();
        }
        return abc.charAt(index);
    }

   
}
