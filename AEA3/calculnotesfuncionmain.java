import java.util.Scanner;
public class calculnotesfuncionmain {

    public static void main(String[] args) {
        calculnotesfuncionmain programa = new calculnotesfuncionmain();
    
        programa.inici();
    }

    public void inici() {

        lectorterminal lector = new lectorterminal();
                calculnotesfunciones calcul = new calculnotesfunciones();


        Scanner s = new Scanner(System.in);
        double nota = 0;
        double notas[] = new double[5];

        System.out.println("Procederemos a calcular la nota promedio de los estudiantes.");


        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca la nota del estudiante:");
            nota = lector.LeerDouble();

            while (nota < 0 || nota > 10) {
                System.out.println("Introduzca una nota entre 0 y 10");
                nota = lector.LeerDouble();
            }
            notas[i] = nota;
        }   
            
        System.out.println("El estudiante obtuvo las siguientes notas:");
        for (int i = 0; i < 5; i++) {
            System.out.println(notas[i]+ "");
        }
        
        

        double promedio = 0;
        double minimo = 0;
        double maximo = 0;
        
        System.out.println("Calculando la nota promedio...");
        promedio = calcul.calcular_promedio(notas);
        System.out.println("El promedio de las notas es " + promedio);
        
        minimo = calcul.calcular_minimo(notas);
        System.out.println("El mínimo de las notas es " + minimo);

        maximo = calcul.calcular_maximo(notas);
        System.out.println("El máximo de las notas es " + maximo);
        
        
     

       
         
    }
    
}




