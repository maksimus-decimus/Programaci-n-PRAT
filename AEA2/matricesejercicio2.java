import java.util.Random;


public class matricesejercicio2 {

    public static void main(String[] args) {
        
    int [][] matriz = new int [3][3];
    Random random = new Random();
    int randomint = random.nextInt(20);
    
    for (int i = 0; i < matriz.length; i++){ //poner num aleatorios
        for (int j= 0; j < matriz.length; j++){
            matriz[i][j] = randomint;
            randomint = random.nextInt(20); 

            System.out.print(matriz[i][j] + " ");
        } System.out.println();
    }


    System.out.println();
    for (int i = 0; i < matriz.length; i++){ //CAMBIAR DE LADOS LAS COSAS
        for (int j= i+1; j < matriz.length; j++){
            int temp = matriz[i][j];
            matriz[i][j] = matriz[j][i];
            matriz[j][i] = temp;
            
        } 
    }

    for (int i = 0; i < matriz.length; i++){
        for (int j= 0; j < matriz.length; j++){
            System.out.print(matriz[i][j] + " ");
            
        }
        System.out.println();
    }

    
     




    
    
    
    
    
    
    
    
    
    }
}