import  java.util.Scanner;

public class consolaescaner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean activo = true;

        while (activo) {
            System.out.println("¿Cuántas repeticiones?");
            int rep = sc.nextInt();

            System.out.println("¿Qué caracter desea imprimir?");
            char caracter = sc.next().charAt(0);
            
            funcio(rep, caracter);  
            System.out.println("¿Desea continuar?");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("Si")) {
                System.out.println();
            }
            else {
                activo = false;
            }
        }
        
    }


    //UNA ÚNICA FUNCIÓN
    public static void funcio(int rep, char caracter) {
        for (int i = 0; i < rep; i++) {
            System.out.print(caracter);    
        }
        System.out.println(" ");
    }



}

