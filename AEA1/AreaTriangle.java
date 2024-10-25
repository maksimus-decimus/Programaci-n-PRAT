package AEA1;
import java.util.Scanner;

public class AreaTriangle {
  public static void main (String args[]){
    Scanner lector = new Scanner(System.in);
   
    System.out.println("Vamos a calcular el área de un triangulo");
    System.out.println("Escribe la anchura del triangulo:");
      int b= lector.nextInt();

    System.out.println("Escribe la altura del triangulo:");
      int h= lector.nextInt(); 

    System.out.println("El área del triangulo es: " + (b*h)/2); 

    //Calculem l'area del triangle: Area = (width*height)/2
    //Imprimim a la terminal el calcul
  }
}
