package AEA4.importar;

public class ParellsExcepcions {    
    public static void main(String[] args) {

        try {
            //Caldrà emmagatzemar 100 enters.
            int[] arrayParells = new int[100];
            //Anem omplint cada posici .
            for(int i = 0; i <= arrayParells.length; i++) {
            arrayParells[i] = 2*i;
        }
    
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("¡Error! Fuera de límites: " + e.getMessage());
        }
        finally {
            System.out.println("El programa ha acabat.");
        }
    }
}


