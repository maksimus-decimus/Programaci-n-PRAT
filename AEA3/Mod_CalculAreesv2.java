public class Mod_CalculAreesv2 {

    public  double cuadrado(double r) {
        return Math.pow(r, 2);
    }

    public  double triangulo(double b, double h) {
        return (b * h) / 2;
    }

    public  double trapezio(double a, double b, double h) {
        return ((a * b) * h) / 2;
    }

    public  double rombo(double dM, double dm) {
        return (dM * dm) / 2;
    }

    public  double paralelogramo(double b, double h) {
        return b * h;
    }

    public  double cercle(double r) {
        return Math.pow(r, 2) * Math.PI;
    }

    public double rectangle(double a, double b) {
        return a * b;
    }

}
