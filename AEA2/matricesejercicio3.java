import java.util.Random;


public class matricesejercicio3 {

    public static void main(String[] args) {
        
    int [][] pares = new int [10][10];
    int contador = 0;
    int contador_senar = 1;

    for (int i = 0; i < pares.length; i++){
        for (int j = 0; j < pares[i].length; j++){
            if (i % 2 == 0){
                pares[i][j]  = contador *2;
                System.out.print(pares[i][j] + " ");
                contador+= 1;
            } else {
                pares[i][j] = contador_senar * 2 + 1;
                System.out.print(pares[i][j] + " ");
                contador_senar+=2;
            }
        }System.out.println();
    }
    
     




    
    
    
    
    
    
    
    
    
    }
}