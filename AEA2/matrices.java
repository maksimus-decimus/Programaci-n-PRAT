import java.util.Random;

public class matrices {

    public static void main(String[] args) {
        
    int [][] matriz = new int [3][3]; // matriz 3 x 3
    Random random = new Random(); //generar num aleatorio
    int suma = 0; // suma al 0
    int randomint = random.nextInt(100); // primer num aleatorio
    int max = randomint; // max con el mismo numero
    int min = randomint; // min con el mismo numero

    for (int i = 0; i < matriz.length;i++){
        for (int j = 0; j < matriz[i].length;j++){ //inicializar ambas matrices
            
            matriz[i][j] = randomint; //asignar un numero aleatorio
            if (randomint < min){
                min = randomint;
            }
            if (randomint > max){
                max = randomint;
            }
            suma += randomint;
            
            System.out.print(randomint + " ");
              
            randomint = random.nextInt(100); //generar un numero aleatorio
        } System.out.println();
    } System.out.println();


    System.out.println("Suma: " + suma);
    System.out.println(min);
    System.out.println(max);
    



    
    
    
    
    
    
    
    
    
    }
}