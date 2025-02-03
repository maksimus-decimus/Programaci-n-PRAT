public class funcionencontrarsegundonum {
    public static void main(String[] args) {
        // encontrar el segundo numero más grande dentro del vector
        int [] array = {11,10,9,5,6,7,2,12};
        int segundo = 0;
        int primero = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] > primero){
                primero = array[i];
            }
        }

        for (int i = 0; i < array.length; i++){
            if (primero != 0){
                if (array[i] > primero && array[i] > segundo){
                    segundo = array[i];
                }

            }
            }System.out.println("El más grande es: "+ primero);
        System.out.println("El segundo más grande es "+ segundo);
        }

        


    } 



    

