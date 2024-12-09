import java.util.Random;

public class cincoporcincotres {
    public static void main(String[] args) {
        
    int [][] matriz = new int[5][5];
    Random randomNum = new Random();
    int total = 0;

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            
            matriz[i][j] = randomNum.nextInt(101);
            total += matriz[i][j];
        } 
    } 
   
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
       
        System.out.println("Posición " + i + " " + j + " de la matriz es: " + matriz[i][j]);    
        } 
    }System.out.println("El promedio de los valores de la matriz es: " + total/25);
    
    
    
    




    }             
}