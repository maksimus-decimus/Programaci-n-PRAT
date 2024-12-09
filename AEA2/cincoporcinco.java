import java.util.Random;

public class cincoporcinco {
    public static void main(String[] args) {
        
    int [][] matriz = new int[5][5];
    Random randomNum = new Random();

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            
            matriz[i][j] = randomNum.nextInt(101);
        } 
    } 
   
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
       
        System.out.println("Posición " + i + " " + j + " de la matriz es: " + matriz[i][j]);    
        } 
    }
    
    
    
    




    }             
}