
import java.util.Scanner;

public class examen3{
    public static void main(String[] args) {
        
    //matriz personalizada por filas y columnas
    // llenar matriz por valores personalizadas
    // imprimir la matriz final

    Scanner lector = new Scanner(System.in);
    
    int fila = 0;
    int columnas = 0;
    int valor = 0;
    

    System.out.println("Introduce las FILAS de la matriz"); // pedir las filas
    fila = lector.nextInt();
    while (fila < 0){ //control de errores 
        System.out.println("Posa un numero vàlid...");
        fila = lector.nextInt();
    }
    

    System.out.println("Introduce las COLUMNAS de la matriz"); //pedir columnas
    columnas = lector.nextInt();

    while (columnas < 0){ //control de errores
        System.out.println("Posa un numero vàlid...");
        columnas = lector.nextInt();
    }

    int [][] matriz = new int [fila][columnas]; //añadir todo a la matriz una vez pasado los filtros
    
    for (int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz[i].length; j++){ //Recorrer
        System.out.println();
        System.out.println("Introduzca el valor de la fila "+i+" de la columna "+j+":");
        
        valor = lector.nextInt();
            
        while (valor < 0){ //si el valor es negativo, pasar si es positivo añadir
            System.out.println("No vaciles y pon un número positivo anda...");
            valor=lector.nextInt();

            if (valor > 0){
                valor = valor;
            }
        } 
        
        matriz[i][j] = valor; //añadir el valor a la matriz

        }System.out.println();
    } 

    for (int i = 0; i < matriz.length; i++){ //imprimir la matriz final
        for(int j = 0; j < matriz[i].length; j++){
        
        System.out.print(matriz[i][j]+" ");
        }System.out.println();
    } 
    
    
    

    
    




    }       
}