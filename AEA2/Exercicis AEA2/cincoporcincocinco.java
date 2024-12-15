
import java.util.Scanner;

public class cincoporcincocinco {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce las filas: ");
        int fila = lector.nextInt();

        System.out.println("Introduce las columnas: ");
        int columna = lector.nextInt();

        int [][] matriz = new int[fila][columna];

        System.out.println("Ahora introduce los valores de los elementos: ");
        for (int i = 0; i < fila; i++){
            for (int j = 0; j < columna;j++){
                int valores= 0;

                System.out.println("FILA = ["+ i + "] COLUMNA= [" + j + "]: ");
                valores= lector.nextInt();

                while (valores < 0 || valores > 10 ){
                    System.out.println("Solo desde 0 a 10");
                    System.out.println("FILA = ["+ i + "] COLUMNA= [" + j + "]: ");
                    valores= lector.nextInt();
                }


                matriz[i][j]=valores;
                

            }

        }
         
        

        System.out.println(" ");
        System.out.println("MATRIZ: ");
        System.out.println("================");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("================");
        for (int numactual = 0 ; numactual <= 10; numactual++){
            int repe = 0;
            for(int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == numactual) {
                        repe++;
                    }
                }
            }
           
            
            System.out.println(numactual + " se repite: "+ repe + " veces");
        }       
    }
}