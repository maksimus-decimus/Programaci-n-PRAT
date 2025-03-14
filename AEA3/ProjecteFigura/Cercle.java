package ProjecteFigura;

public class Cercle extends Figura{

    private int radi  = 0;

    public Cercle(){
        super("cercle");
    }

    public Cercle(int r){
        super("cercle"); //Figura f = new Figura ("cercle");
        this.radi = r;
    }

    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }

    @Override
    public double calcularArea() {
        return Math.pow(radi, 2)*Math.PI;
    }
}
