import java.util.Random;

public class cincoporcinco {
    public static void main(String[] args) {
        
    int [][] matriz = new int[5][5];
    Random randomNum = new Random();
    int total = 0;
    int numMax = matriz[0][0];
    int contador = 0;

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            
            matriz[i][j] = randomNum.nextInt(101);
            total += matriz[i][j];
            System.out.print(matriz[i][j]+ " ");
             if (matriz[i][j] > numMax) {
                numMax = matriz[i][j];
            
            }
            
        } 
        System.out.println(i);
        
    } 
    System.out.println("El promedio de los valores de la matriz es: " + total/25); 
    System.out.println("El valor maximo de la matriz es: " + numMax);

 
    
    
    




    }             
}