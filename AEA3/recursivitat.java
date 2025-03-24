public class recursivitat {

    public static void main(String[] args) {
        int num = 4;
        int num_potencia = 2;
        String palabra = "hola";
        int digito = 20;
        int digito2 = 7;
        int digito3 = 10;
        int digito4 = 100;

        System.out.println("La suma de los números a partir de " + num + " es: " + factorial(num));
        System.out.println("La potencia de " + num_potencia + " es: " + potencia(num_potencia, 3));
        System.out.println("La palabra " + palabra + " invertida es: " + invertirString(palabra));
        System.out.println("El número " + digito + " tiene " + contar_digitos(digito) + " dígitos");
        System.out.println("El número " + digito2 + " tiene " + contar_digitos(7 ) + " dígitos");
        System.out.println("El número " + digito3 + " tiene " + contar_digitos(10) + " dígitos");
        System.out.println("El número " + digito4 + " tiene " + contar_digitos(100) + " dígitos");

    }


    //COPIADA Y PEGADA DEL AÑO 

    public static int factorial(int n) {
        if (n == 0) { 
            return 0; 
        }
        return n + factorial(n - 1);
    }

    public static int potencia(int n, int p) {
        if (p == 0) {
            return 1;
        }
        return n * potencia(n, p - 1);
    }

    public static String invertirString(String s) {
        if (s.length() == 0) {
            return "";
        }
        return s.charAt(s.length() - 1) + invertirString(s.substring(0, s.length() - 1));
    }

    public static int contar_digitos(int n) {
        
        if (n < 10) {
            return 1;
        }
        return 1 + contar_digitos(n / 10);
    }
}
