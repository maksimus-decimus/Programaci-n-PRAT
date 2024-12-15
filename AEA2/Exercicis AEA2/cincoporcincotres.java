import java.util.Scanner;
public class cincoporcincotres {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el tamaño de las FILAS Y COLUMNAS de AMBAS matrices: ");
        int n = lector.nextInt();

        int [][] matriz1 = new int[n][n]; //si furula, furula
        int [][] matriz2 = new int[n][n];
        int [][] suma = new int[n][n];

        System.out.println(" ");
        System.out.println("Teclea las posiciones de la primera matriz: ");
        for (int i = 0; i < n; i ++ ){
            for (int j = 0; j < n; j++){
                System.out.println("Matriz 1: [" + i + " ][" + j + "]: ");
                matriz1[i][j] = lector.nextInt();
            }
        }
        System.out.println(" ");
        System.out.println("Teclea las posiciones de la segunda matriz: ");
        for (int i = 0; i < n; i ++ ){
            for (int j = 0; j < n; j++){
                System.out.println("Matriz 2: [" + i + " ][" + j + "]: ");
                matriz2[i][j] = lector.nextInt();
            }
        }        


        for (int i = 0; i < n; i ++ ){ //suma de ambas matrices
            for (int j = 0; j < n; j++){
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }   
        } 


        System.out.println(" ");
        System.out.println("===========");
        System.out.println("Matriz 1: ");
        for (int i = 0; i < matriz1.length; i ++ ){
            for (int j = 0; j < matriz1.length; j++){
                System.out.print(matriz1[i][j] + " ");
            } 
            System.out.println(" ");
        } System.out.println("===========");


        System.out.println(" ");
        System.out.println("===========");
        System.out.println("Matriz 2: ");
        for (int i = 0; i < matriz2.length; i ++ ){
            for (int j = 0; j < matriz2.length; j++){
                System.out.print(matriz2[i][j] + " ");
            } 
            System.out.println(" ");
        } System.out.println("===========");


        System.out.println(" ");
        System.out.println("===========");
        System.out.println("SUMA DE AMBAS MATRICES: ");
        for (int i = 0; i < suma.length; i ++ ){
            for (int j = 0; j < suma.length; j++){
                System.out.print(suma[i][j] + " ");
            } 
            System.out.println(" ");
        } System.out.println("===========");
        
        
    
    
    
    




    }             
}