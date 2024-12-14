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
    ArrayList<Integer> primos = new ArrayList<>(); // Meter los senares en un array aparte para no romperme la cabeza contra la pared
    ArrayList<Integer> par = new ArrayList<>(); //si funciona, funciona, así que ahora toca con los pares y me voy mi casa
    int diagonal = 0;
    int filas = 0;

    System.out.println("=================");
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            
            matriz[i][j] = randomNum.nextInt(101);
            total += matriz[i][j]; //añadir todo al total
            
            
             if (matriz[i][j] > numMax) { //buscar num max
                numMax = matriz[i][j];
                contador = 1;
            
            } else if (matriz[i][j] == numMax) { //contar num max

                contador++;

            }

            if (matriz[i][j] % 2 == 0) { //pares
                par.add(matriz[i][j]);
            } 

            if (matriz[i][j] < 2){ //primos
                primos.add(matriz[i][j]);
                }
            for (int x = 2; x <= matriz[i][j]; x++){ //comprobar que sea primo
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
    
    for(int i = 0; i < matriz.length; i++) {
        diagonal += matriz[i][i];
    }
    for(int i = matriz.length - 1; i >= 0; i--) {
        diagonal += matriz[i][matriz.length-1-i]; // cada fila va retrociendo en columna como si fuera en diagonal
    }
    for(int i = 0; i < matriz.length; i++) {
        filas += matriz[matriz.length - 1][i]; //última fila 
    }

    // q guarrada tu
    System.out.println("=================");
    System.out.println("El promedio de los valores de la matriz es: " + total/25);
    System.out.println("El valor máximo de la matriz es: " + numMax);
    System.out.println("El número de veces que se repite es: " + contador);
    System.out.println("Números primos:");
    System.out.println(primos); 
    System.out.println("Números pares: ");
    System.out.println(par);
    System.out.println("Suma de las diagonales: "+ diagonal); 
    System.out.println("Suma de la última fila: "+ filas);
    

    
    
    


    }             
}
