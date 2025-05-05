package AEA4.importar;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

//**
 




public class contador {
    public static void main(String[] args) {
        
        try {
            //Lectura d'arxiu
            File f = new File("C:/Users/maxyf/Documents/arxiu.txt");
            Scanner lector = new Scanner(f);
            int numParaules = 0;
            StringBuilder fraserecta = new StringBuilder(); // objecte de la classe frase recta

            

            while (lector.hasNext()) {
                String paraula = lector.next();
                fraserecta.append(paraula).append(" "); //poner frase 
                numParaules++;
            }
            lector.close();

            String fraseinvertida = invertirFrase(fraserecta.toString()); //objecte de la classe frase invertida

            //Escriptura d'arxiu
            File g = new File("C:/Users/maxyf/Documents/arxiu_comptat_invertit.txt");
            PrintWriter escriptor = new PrintWriter(g);
            escriptor.println(numParaules + " paraules.");
            escriptor.println("Frase invertida: " + fraseinvertida.toString());
            escriptor.close();
        }

        catch (java.io.FileNotFoundException e) {
            System.out.println("Error: L'arxiu no s'ha trobat.");
        }
        catch (java.io.IOException e) {
            System.out.println("Error: Hi ha hagut un problema amb l'arxiu.");
        }
        catch (Exception e) {
            System.out.println("Error inesperat: " + e.getMessage());
        }
        finally {
            System.out.println("El programa ha acabat.");
        }
    }
    


    public static String invertirFrase(String frase) {
        String[] paraules = frase.split(" ");
        StringBuilder fraseInvertida = new StringBuilder();

        for (int i = paraules.length - 1; i >= 0; i--) {
            StringBuilder paraulaInvertida = new StringBuilder(paraules[i]);
            fraseInvertida.append(paraulaInvertida.reverse()).append(" ");
        }
        return fraseInvertida.toString().trim();
    }
}
