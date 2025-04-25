package AEA4.importar;

public class Excepcio01 {
    public static void main(String[] args) {

        try {
            String t[] = {"Hola", "Adéu", "Fins demà"};
            for (int i = 0; i <= t.length; i++) {
                System.out.println("Posició " + i + ": " + t[i]);
            }
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Surt del limits de l'array.");
        }

        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error en l'index de la cadena.");
        }

        finally {
            System.out.println("El programa ha acabat.");
        }
    }
}
