package ProjecteFigura;

public class MainFigura {
    public static void main(String[] args) {
        Triangle t = new Triangle(23,12); //Triangle("TRIanGKE",23,12);
        t.imprimirDades();

        Quadrat q = new Quadrat(3);
        q.imprimirDades();

        Rectangle r = new Rectangle();
        r.setCostat1(12);
        r.setCostat2(8);
        r.imprimirDades();
        Rectangle r2 = new Rectangle("rectangle", 2, 3);


        Trapezi tr = new Trapezi(15,5,6);
        tr.imprimirDades();

        Rombe rb = new Rombe(12,3);
        rb.imprimirDades();

        Pararllelogram pl = new Pararllelogram(7,2);
        pl.imprimirDades();

        Cercle c = new Cercle(23);
        c.imprimirDades();
    }
}