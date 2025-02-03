import java.util.Scanner;

public class LlegirEnters {
    public static void main(String[] args) {
        LlegirEnters programa = new LlegirEnters();
        programa.inici();

    }

    public void inici() {
        System.out.println("Llegiu un enter per teclat: ");
        double a = llegirEnterTeclat();
        System.out.println("L'enter ha estat "+ a +"." );
        System.out.println("Llegiu un enter per teclat; ");
        a = llegirEnterTeclat();
        System.out.println("L'altre enter ha estat "+ a + ".");
    }

    public double llegirEnterTeclat() {
        Scanner lector = new Scanner(System.in);
        double enterLlegit= 0;
        boolean llegit = false;

        while (!llegit) {
            llegit = lector.hasNextDouble();
        if (llegit) {
            enterLlegit = lector.nextDouble();
        } 
        else {
            System.out.println("No es un enter.");
            lector.nextDouble();
        }
}       lector.nextLine();
        return enterLlegit;
    
    }
}
