package AEA4.importar;
import java.io.File;

public class FileObtenirRuta {
    public static void main(String[] args) {
        FileObtenirRuta programa = new FileObtenirRuta();
        programa.iniciar();
    }

    public void iniciar() {
        File carpetaAbs= new File("C:/Temp");
        File fitxerAbs = new File("C:/Temp/Document0.txt");

        File carpetaRel = new File("Temp");
        File fitxerRel = new File("Temp/Document0.txt");

        mostrarRuta(carpetaAbs);
        mostrarRuta(fitxerAbs);

        mostrarRuta(carpetaRel);
        mostrarRuta(fitxerRel);
    }

    public void mostrarRuta(File ruta) {
        System.out.println("Ruta absoluta: " + ruta.getAbsolutePath());
        System.out.println("Su padre es " + ruta.getParent());
        System.out.println("Nom del fitxer: " + ruta.getName()+ "\n");
    }
        

}
