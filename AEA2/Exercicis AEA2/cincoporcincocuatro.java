import java.util.Random;


public class cincoporcincocuatro{
    public static void main(String[] args){

        Random randomNum = new Random();
       
        
        int [] vector = new int [10]; //estás tú que le pido al usuario nada, al usuario ni agua

        for (int i = 0; i < vector.length; i++) {
            vector[i] = randomNum.nextInt(11);   
        }

        int min = vector[0];
        int min2 = 10;

        for (int i = 0; i < vector.length; i++){
            
            if (vector[i] <= min){
              
                min = vector[i];
                
            }else if (vector[i] < min2) {
                min2 = vector[i];
            }
        }

        System.out.println(" ");
        System.out.println("Vector: ");
       
        System.out.println("======================");
        for (int i = 0; i < vector.length; i ++ ){
            System.out.print(vector[i] + " ");
              
        } System.out.println(" ");
        
        System.out.println("======================");

        System.out.println("El segundo más peque es: " + min2);

    }
}