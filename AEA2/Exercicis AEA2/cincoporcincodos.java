import java.util.Random;
import java.util.Scanner;

public class cincoporcincodos {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        Random randomNum = new Random();  

        System.out.print("Introduzca el número de columnas que desea aplicar a la matriz: ");
        int n = lector.nextInt();
        
        int [][] matriz = new int[5][n];

        for (int i = 0; i < matriz.length; i ++ ){
            for (int j = 0; j < matriz[i].length; j++){

                matriz[i][j] = randomNum.nextInt(11);
            }
        }
        
        System.out.println("==========");
        for (int i = 0; i < matriz.length; i ++ ){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println( " ");
        } 

        System.out.println("==========");
        
        System.out.println(" ");


    }
}
    
    
    




