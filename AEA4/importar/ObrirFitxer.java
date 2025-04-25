package AEA4.importar;
import java.io.File;
import java.util.Scanner;

public class ObrirFitxer {
    public static void main(String[] args) {
    
        try {
            File f = new File("C:/Temp/Document0.txt");
            Scanner sc = new Scanner(f);
            System.out.println("Fichero abierto correctamente");

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
