package Reservas;

public class Casa  extends Allotjament{

    boolean teJardi;
    boolean tePiscina;

    public Casa(String nom, int capacitat, boolean disponible, double Calcul_PreuNit, boolean teJardi, boolean tePiscina){
        super(nom, capacitat, disponible, Calcul_PreuNit);
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }

    public boolean isTeJardi() {
        return teJardi;
    }

    public void setTeJardi(boolean teJardi) {
        this.teJardi = teJardi;
    }

    public boolean isTePiscina() {
        return tePiscina;
    }

    public void setTePiscina(boolean tePiscina) {
        this.tePiscina = tePiscina;
    }

    @Override
    public double getCalcul_PreuNit() {
        // TODO Auto-generated method stub
        return super.getCalcul_PreuNit();
    }

    @Override
    public void setCalcul_PreuNit(double Calcul_PreuNit) {
        // TODO Auto-generated method stub
        super.setCalcul_PreuNit(Calcul_PreuNit);
    }

    @Override
    public void Mostrar_informacio(){
        
        System.out.println("Casa Rural: "+ nom + " (Jardí: " + (teJardi ? "Sí, " : "No, ") + "Piscina: " + (tePiscina ? "Sí) ": "No) ") + (Disponible ? "- Disponible" : "No disponible")  );
    }
}
