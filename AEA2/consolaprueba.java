public class consolaprueba {

    public static void main(String[] args) { 
        estrellitas(8);
        guiones(1);
        numeros(6, 5);
        estrellitas(3);
        guiones(5);
        numeros(2, 3);
        System.out.println();
        System.out.println("=================================");
        System.out.println("Solo una función:");
        System.out.println();
        funcio(8, '*');
        funcio(1,'-');
        funcio(6, '5');
        funcio(3, '*');
        funcio(5, '-');            
        funcio(2, '3');
    }

    //FUNCIONES INDIVIDUALES
    public static void estrellitas(int rep) {
        for (int i = 0; i < rep; i++) {
            System.out.print('*');    
        }
        System.out.println();
    }

    public static void guiones(int rep) {
        for (int i = 0; i < rep; i++) {
            System.out.print('-');    
        }
        System.out.println();
    }

    public static void numeros(int rep, int num) {
        for (int i = 0; i < rep; i++) {
            System.out.print(num);    
        }
        System.out.println();
    }


    //UNA ÚNICA FUNCIÓN
    public static void funcio(int rep, char caracter) {
        for (int i = 0; i < rep; i++) {
            System.out.print(caracter);    
        }
        System.out.println(" ");
    }



}

