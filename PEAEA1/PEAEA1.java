import java.util.Scanner;

public class PEAEA1{
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    double descompteMAX= 15; 
    double total = 0;
    double descompte = 0;
    double preu_total_tot = 0;
    
    System.out.println("Bienvenid@ a la calculadora de precios, deberás introducir 5 precios de productos para saber si tienen descuento.");
    for (int i = 1; i<6; i++){
        System.out.println("Introduce el precio del producto " + i );
        double preu = lector.nextDouble();

        while (preu<0){
            System.out.println("Introduce el precio del producto "+ i);
            preu = lector.nextDouble();
        }

        if(preu>0){
        total = preu;
            if(preu>50){
                descompte = preu - (preu*0.6);
            if (descompte > descompteMAX){
                descompte = descompteMAX;
            }
        total = (preu - descompte);
        System.out.println("El descuento del producto " + i + " es " + descompte + " euros");
        System.out.println("El total del producto "+i+" es "+ total + " euros"); 
        
            

            }preu_total_tot += total;
                 
        } 
        
    } 

    System.out.println("El total de todo es "+preu_total_tot);


    
    

    

    }
}