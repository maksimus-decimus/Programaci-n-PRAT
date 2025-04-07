package MasterMind;
import static MasterMind.CodeGenerator.*;
import static MasterMind.Feedback.*; //importar de Feedback

import java.util.Random;
import java.util.HashSet; // hashset para ponerlas en el set y que no se dupliquen (la ia me lo ha dicho, así que lo he usado)

public class COM extends Player {

    Feedback feedback = new Feedback();
    Random random = new Random();

    private char[] letrasCorrectas; // recordar letras acertadas
    private HashSet<Character> letrasIncorrectas = new HashSet<>(); // recordar letras incorrectas
    private HashSet<Character> posibles = new HashSet<>(); // recordar letras posibles

    public COM() {
        letrasCorrectas = new char[LONG_SECRET]; // inicializar el array de letras correctas
        for (int i = 0; i < letrasCorrectas.length; i++) {
            letrasCorrectas[i] = ' '; 
        }        
    }     

    @Override
    public String preguntarResposta() {
        StringBuilder resposta = new StringBuilder(); //recomienda la ia usar strinbuilder para no crear un nuevo objeto cada vez que se concatena

    for (int i = 0; i < LONG_SECRET; i++) { //en base a la longitud de la palabra secreta, ajustar generacion
            if (letrasCorrectas[i] != ' ') {
                // si ya conocemos la letra correcta en esta posicion, la usamos en exactamente la misma posicion
                resposta.append(letrasCorrectas[i]);
            } else {
                char letra;
                do {
                    int index = random.nextInt(abc.length()); //generar basura aleatoria
                    letra = abc.charAt(index);
                } while (letrasIncorrectas.contains(letra)); // revisar que no esté descartado, si lo está, volver a generar
                resposta.append(letra); //enviar esto a la respuesta
            }
        }
        return resposta.toString();
    }

    public void procesarPista(String resposta, String pista) {
        for (int i = 0; i < pista.length(); i++) {
            char charPista = pista.charAt(i);
            char charResposta = resposta.charAt(i);
            if (charPista == TOT_CORRECTE) {
                // si la pista indica que la letra este en la posicion correcta, para luego volverlas a usar
                letrasCorrectas[i] = charResposta;

            } else if (charPista == MALA_POSICIO) {

                posibles.add(charResposta); // agregar a posibles, para volverlas a usar en otra posicion
            } else if (charPista == INCORRECTE) {
                // si no es correcto, agregar al hash set para descartar las letras
                letrasIncorrectas.add(charResposta);
            }
           
        }
    }

    public boolean intentarAdivinar(String secret) {
        String resposta = preguntarResposta(); 
        System.out.println("La màquina ha intentat: " + resposta);
        // resolver la respuesta y obtener la pista

        String pista = feedback.generarPista(secret, resposta);
        System.out.println("Pista generada per la màquina: " + pista);
        

        procesarPista(resposta, pista);

        return resposta.equals(secret); // devolver true si la maquina acierta
    }



}
