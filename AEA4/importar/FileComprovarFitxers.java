package AEA4.importar;
import java.io.File;


public class FileComprovarFitxers {
    public static void main(String[] args) {
        FileComprovarFitxers programa = new FileComprovarFitxers();
        programa.iniciar();
    }

    public void iniciar() {
        File temp = new File("C:/Temp");
        File fotos = new File("C:/Temp/fotos");
        File documento = new File("C:/Temp/Document0.txt");

        System.out.println(temp.getAbsolutePath() + " existeix? " + temp.exists());
        mostrarEstat(fotos);
        mostrarEstat(documento);
    }

    public void mostrarEstat(File f) {
        System.out.println(f.getAbsolutePath() + " és un fitxer? " + f.isFile());
        System.out.println(f.getAbsolutePath() + " és una carpeta? " + f.isDirectory());

    }

}
