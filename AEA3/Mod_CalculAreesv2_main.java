import java.util.Scanner;

public class Mod_CalculAreesv2_main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Mod_CalculAreesv2 areas = new Mod_CalculAreesv2();
        lectorterminal lector = new lectorterminal();

        System.out.println("De quina figura vols calcular l'area?\n");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");
        System.out.println("Si desea salir, escriba 'Salir'.");
        String figura = s.nextLine();
        double area = 0;

        if (figura.equals("triangle")){

            System.out.println("Introduce la base del triangulo");
            double b = lector.LeerDouble();
            System.out.println("Introduce la altura del triangulo");
            double h = lector.LeerDouble();

            area = areas.triangulo(b,h);
        }

        else if (figura.equals("quadrat")){

            System.out.println("Introduzca lado del cuadrado");
            double r = lector.LeerDouble();
            area = areas.cuadrado(r);
        }

        else if (figura.equals("rectangle")){

            System.out.println("Introduzca el largo del rectángulo");
            double a = lector.LeerDouble();
            System.out.println("Introduzca el ancho del rectángulo");
            double b = lector.LeerDouble();
            area = areas.rectangle(a,b);
        }
          

        else if (figura.equals("trapezi")){

            System.out.println("Introduzca la base mayor del trapecio:");
            double a = lector.LeerDouble();
            System.out.println("Introduzca la base menor del trapecio:");
            double b = lector.LeerDouble();
            System.out.println("Introduzca la altura del trapecio:");
            double h = lector.LeerDouble();
          area = areas.trapezio(a,b,h);
        }

        else if (figura.equals("rombe")){

            System.out.println("Introduzca la diagonal mayor del rombo:");
            double dM = lector.LeerDouble();
            System.out.println("Introduzca la diagonal menor del rombo:");
            double dm = lector.LeerDouble();
            area = areas.rombo(dM,dm);
            
        }
           
        else if (figura.equals("paralelogram")){

            System.out.println("Introduzca la base del paralelogramo: ");
            double b = lector.LeerDouble();
            System.out.println("Introduzca la altura del paralelogramo: ");
            double h = lector.LeerDouble();
            area = areas.paralelogramo(b,h);
           
        }

        else if (figura.equals("cercle")){

            System.out.println("Introduzca el radio del círculo:");
            double r = lector.LeerDouble();
            area = areas.cercle(r);
            
        }

        if (figura.equals("Salir")){
            System.out.println("Saliendo del programa.");
            System.exit(0);
        }
            
        if (area != 0) {
            System.out.println("L'area de la figura " + figura + " es " + area);
        }

        
    }

}
