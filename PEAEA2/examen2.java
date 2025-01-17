
import java.util.Scanner;

public class examen2{
    public static void main(String[] args) {
        
    // vector que de longitud a deseos del usuario
    //valores a gustos del usuario
    //buscar valor especificado
    // error si no encuentra el valor anterior

    Scanner lector = new Scanner(System.in);
    
    int longitud = 0;
    int valor = 0;
    int buscar = 0;
    int encontradovector = 0;

    System.out.println("Introduce la longitud del vector"); //lo mismo que antes
    longitud = lector.nextInt();

    int [] vector1 = new int [longitud];
    

    for (int i = 0; i < vector1.length; i++){ //añadir los valores al vector
        System.out.println();
        System.out.println("Introduzca el valor de la posición "+i+" del vector: ");
        valor = lector.nextInt();

        vector1[i] = valor;
        System.out.print(vector1[i]+ " ");
    } System.out.println();
    
    System.out.println("Ahora introduzca el valor a buscar: ");
    buscar = lector.nextInt(); //sentenciar el numero a buscar
    

    for (int i = 0; i < vector1.length; i++){
        if (vector1[i]== buscar){ //si el valor en el vector es igual al buscado
            encontradovector = vector1[i]; //guardar la posición donde se encuentra el valor
               
        }    
    } System.out.println();

    if (encontradovector == buscar){ // si el valor es encontrado, especificar donde y ponerlo, si no, entonces error
        System.out.println("El valor " + buscar+ " ha sido encontrado en la posición " + encontradovector + " del vector.");
    } else {
        System.out.println("Valor no encontrado en el vector.");
    }
    




    }       
}