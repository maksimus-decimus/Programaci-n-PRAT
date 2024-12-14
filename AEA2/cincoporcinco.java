import java.util.ArrayList;
import java.util.Random;

public class cincoporcinco {
    public static void main(String[] args) {
        
    int [][] matriz = new int[5][5];
    Random randomNum = new Random();
    int total = 0;
    int pares = 0;
    int numMax = matriz[0][0];
    int contador = 0;
    ArrayList<Integer> primos = new ArrayList<>(); // He preguntat si es podia fer un nou array per ficar els senars dins, y he intentat aplicar-ho

    System.out.println("=================");
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            
            matriz[i][j] = randomNum.nextInt(101);
            total += matriz[i][j];
            
            
             if (matriz[i][j] > numMax) {
                numMax = matriz[i][j];
                contador = 1;
            
            } else if (matriz[i][j] == numMax) {

                contador++;

            }

            if (matriz[i][j] < 2){
                primos.add(matriz[i][j]);
                }
            for (int x = 2; x <= matriz[i][j]; x++){
                if (matriz[i][j] == x){
                    primos.add(x);
                } else if ((matriz[i][j] % x ) == 0){
                    x = matriz[i][j] + 1;
                }
            }
        
            System.out.print(matriz[i][j]+ " ");    
        }

        System.out.println( " ");
        
    }
    
    System.out.println("=================");
    System.out.println("El promedio de los valores de la matriz es: " + total/25);
    System.out.println("El valor maximo de la matriz es: " + numMax);
    System.out.println("El numero de veces que se repite es: " + contador);
    System.out.println("Números primos:");
    System.out.println(primos); 
    System.out.println("Números pares: ");

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (pares % 2 == 0) {
                System.out.print(matriz[i][j] + " ");
            } else {
                System.out.println("Números primos: ");
                System.out.println();
            }

        }
    } 

    
    
    


    }             
    }
