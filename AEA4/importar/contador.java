package AEA4.importar;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

//**
 




public class contador {
    public static void main(String[] args) {
        
        try {
            //Lectura d'arxiu
            File f = new File("C:/Users/maxyf/Documents/entrada.txt");
            Scanner lector = new Scanner(f);
            int numParaules = 0;
            while (lector.hasNext()) {
                String paraula = lector.next();
                numParaules++;
            }
            lector.close();
            
            //Escriptura d'arxiu
            File g = new File("C:/Users/maxyf/Documents/sortida.txt");
            PrintWriter escriptor = new PrintWriter(g);
            escriptor.println(numParaules + " paraules.");
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
    

}
