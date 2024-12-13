import java.util.Random;

public class cincoporcinco {
    public static void main(String[] args) {
        
    int [][] matriz = new int[5][5];
    Random randomNum = new Random();
    int total = 0;
    int pares = 0;
    int numMax = matriz[0][0];
    int contador = 0;

    System.out.println("=================");
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            
            matriz[i][j] = randomNum.nextInt(101);
            total += matriz[i][j];
            pares += matriz[i][j];


            
            System.out.print(matriz[i][j]+ " ");
             if (pares % 2 == 0) {
                
            }
            
             if (matriz[i][j] > numMax) {
                numMax = matriz[i][j];
                contador = 1;
            
            } else if (matriz[i][j] == numMax) {

                contador++;

            }

        
            
        }
        
    } 
    System.out.println("=================");
    System.out.println("El promedio de los valores de la matriz es: " + pares);
    System.out.println("El promedio de los valores de la matriz es: " + total/25); 
    System.out.println("El valor maximo de la matriz es: " + numMax);
    System.out.println("El numero de veces que se repite es: " + contador);


    }             
    }
