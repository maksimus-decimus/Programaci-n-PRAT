package MasterMind;
import static MasterMind.CodeGenerator.*;
import static MasterMind.Feedback.*; //importar de Feedback

import java.util.Random;
import java.util.HashSet;

public class COM extends Player {

    Feedback feedback = new Feedback();
    Random random = new Random();

    private char[] letrasCorrectas; // recordar letras acertadas
    private HashSet<Character> letrasIncorrectas = new HashSet<>(); // recordar letras incorrectas

    public COM() {
        letrasCorrectas = new char[LONG_SECRET]; // inicializar el array de letras correctas
        for (int i = 0; i < letrasCorrectas.length; i++) {
            letrasCorrectas[i] = ' '; // inicializar 
        }        
    }     

    @Override
    public String preguntarResposta() {
        StringBuilder resposta = new StringBuilder();

    for (int i = 0; i < LONG_SECRET; i++) {
            if (letrasCorrectas[i] != ' ') {
                // si ya conocemos la letra correcta en esta posicion, la usamos
                resposta.append(letrasCorrectas[i]);
            } else {
                // generar una letra aleatoria que no este en letrasIncorrectas
                char letra;
                do {
                    int index = random.nextInt(abc.length());
                    letra = abc.charAt(index);
                } while (letrasIncorrectas.contains(letra));
                resposta.append(letra);
            }
        }
        return resposta.toString();
    }

    public void procesarPista(String resposta, String pista) {
        for (int i = 0; i < pista.length(); i++) {
            char charPista = pista.charAt(i);
            char charResposta = resposta.charAt(i);
            if (charPista == TOT_CORRECTE) {
                // si la pista indica que la letra este en la posicion correcta
                letrasCorrectas[i] = charResposta;
            } else if (charPista == INCORRECTE) {
                // si la pista indica que la letra no este en la palabra secreta
                letrasIncorrectas.add(charResposta);
            }
            // si la pista es MALA_POSICIO, no hacemos nada especial aqui,
            // pero podria implementar logico adicional si lo necesitas.
        }
    }

    public boolean intentarAdivinar(String secret) {
        String resposta = preguntarResposta(); // generar una respuesta aleatoria
        System.out.println("La màquina ha intentat: " + resposta);
        // resolver la respuesta y obtener la pista

        String pista = feedback.generarPista(secret, resposta);
        System.out.println("Pista generada per la màquina: " + pista);
        // procesar la pista para mejorar los intentos futuros

        procesarPista(resposta, pista);

        return resposta.equals(secret); // devolver true si la máquina adivina correctamente
    }



}
