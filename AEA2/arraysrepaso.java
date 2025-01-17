// filas pares y impares
//si la fila par columna par = a
//si la fila par columna impar = z
//si la fila impar columna par = 2
//si la fila impar columna impar = -

import java.util.Scanner;

public class arraysrepaso{
    public static void main(String[] args) {
        
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int filas = sc.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int columnas = sc.nextInt();
        

        char[][] array = new char [filas][columnas];
        char a = 'a';
        char z = 'z';
        char guion = '-';
        char dos = '2';

        
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (i % 2 == 0 && j % 2 == 0){
                    array[i][j] = a;
                }
                else if (i % 2 == 0 && j % 2 != 0){
                    array[i][j] = z;
                }
                else if (i % 2 != 0 && j % 2 == 0){
                    array[i][j] = dos;
                }
                else if (i % 2 != 0 && j % 2 != 0){
                    array[i][j] =guion;
                }
                System.out.print(array[i][j] + "\t ");
            }System.out.println();
        } 
    }       
}