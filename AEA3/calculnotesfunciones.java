import java.util.Scanner;
public class calculnotesfunciones {


    
    public double calcular_promedio(double [] notas){
        int n = notas.length;
         double promedio = 0;

         for (int i = 0; i < n; i++) {
             promedio += notas[i];
         }
         promedio = promedio / n;
         return promedio;
    }
    
    public double calcular_minimo(double [] notas){
        int n = notas.length;
        double minimo = notas[0];

        for (int i = 0; i < n; i++) {
            if (notas[i] < minimo) {
                minimo = notas[i];
            }
        }
        return minimo;
    }
    
    public double calcular_maximo(double [] notas){
        int n = notas.length;
        double maximo = 0;

        for (int i = 0; i < n; i++) {
            if (notas[i] > maximo) {
                maximo = notas[i];
            }
        }
        return maximo;
    }
}
      