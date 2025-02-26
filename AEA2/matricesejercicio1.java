

public class matricesejercicio1 {

    public static void main(String[] args) {
        
    int [][] matriz = new int [3][3];
    int [][] matriz2 = new int [3][3];
    int [][] matriztotal = new int [3][3];


    int contador = 0;

    for (int i = 0; i < matriz.length; i++){
        for (int j = 0; j < matriz[i].length; j++){
            contador++;
            matriz[i][j] = contador;

            System.out.print(matriz[i][j]+ " ");
        } System.out.println();
    }

    System.out.println();

    for (int i = 0; i < matriz2.length; i++){
        for (int j = 0; j < matriz2[i].length; j++){
            contador++;
            matriz2[i][j] = contador;
            
            System.out.print(matriz2[i][j]+ " ");
        } System.out.println();
    }

    
    for (int i = 0;i < matriz.length; i++){
        for (int j = 0; j < matriz[i].length; j++){
            matriztotal[i][j] = matriz[i][j] + matriz2[i][j];
        }
    }

    System.out.println();
    System.out.println("TOTAL: ");
    for (int i = 0;i < matriz.length; i++){
        for (int j = 0; j < matriz[i].length; j++){
            System.out.print(matriztotal[i][j]+ " ");
        } System.out.println();
    }
    

    
     




    
    
    
    
    
    
    
    
    
    }
}