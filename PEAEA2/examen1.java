
import java.util.Scanner;

public class examen1{
    public static void main(String[] args) {
        
    // 2 vectores de longitud puesta por el usario
    //elementos del vector puestos por el usuario
    // suma total de ambos vectores
    
    Scanner lector = new Scanner(System.in);
    
    
    int longitud = 0;
    int valor = 0;

    System.out.println("Introduce la longitud del PRIMER vector"); // ni comento es obvio
    longitud = lector.nextInt();

    int [] vector1 = new int [longitud]; //añadir longtiud al vector
    

    for (int i = 0; i < vector1.length; i++){ //añadir los valores al vector
        System.out.println("Introduzca el valor de la posición "+i+" del PRIMER vector: ");
        valor = lector.nextInt();

        vector1[i] = valor;
        System.out.print(vector1[i]+ " ");
    } System.out.println();
    

    int [] vector2 = new int [longitud]; //copiar la misma longitud del primer vector

    for (int i = 0; i < vector2.length; i++){
        System.out.println("Introduzca el valor de la posición "+ i + " del SEGUNDO vector: ");
        valor = lector.nextInt();

        vector2[i] = valor;
        System.out.print(vector2[i]+ " ");
    } System.out.println();
    
    System.out.println("Sumando...");
    System.out.println("La suma de los vectores es: ");

    int [] vectortotal = new int [longitud];

    for (int i = 0; i < vector1.length; i++){
        
        vectortotal[i] = vector1[i]+vector2[i]; //sumar los valores del vector a OTRO vector

        System.out.print(vectortotal[i]+ " "); //imprimir todos los valores del vector
    } System.out.println();

    
    

    



















    }       
}