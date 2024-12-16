public class consola {

    public static void main(String[] args) { 
        funcio(8, '*');
        funcio(1,'-');
        funcio(6, '5');
        funcio(3, '*');
        funcio(5, '-');
        funcio(2, '3');
    }

    public static void funcio(int rep, char caracter) {
        for (int i = 0; i < rep; i++) {
            System.out.print(caracter);
            
        }
        System.out.println(" ");
    }


}

