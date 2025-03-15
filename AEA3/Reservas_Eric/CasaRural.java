package Reservas_Eric;

public class CasaRural extends Allotjament{
    private boolean tePiscina;
    private boolean teJardi;
    


    public CasaRural(String nom, int capacitat, boolean disponibilitat, double PreuNit, boolean teJardi, boolean tePiscina){
        super(nom, capacitat, disponibilitat, PreuNit);
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }
    
    public boolean isTePiscina() {
        return tePiscina;
    }
    public void setTePiscina(boolean tePiscina) {
        this.tePiscina = tePiscina;
    }
    public boolean isTeJardi() {
        return teJardi;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getCapacitat() {
        return capacitat;
    }
    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }
    public boolean isDisponibilitat() {
        return disponibilitat;
    }
    public void setDisponibilitat(boolean disponibilitat) {
        this.disponibilitat = disponibilitat;
    }
    public void setTeJardi(boolean teJardi) {
        this.teJardi = teJardi;
    }
    public double getPreuNit() {
        return PreuNit;
    }

    public void setPreuNit(double PreuNit) {
        this.PreuNit = PreuNit;
    }

    @Override
    public void mostrarInformacio(){
        System.out.println("--------------------");
        System.out.println("Nom: " + nom);
        System.out.println("Capacitat: " + capacitat);
        System.out.println((disponibilitat ? "Disponible" : "No disponible"));
        System.out.println("Preu per nit: " + PreuNit);
        System.out.println("Jardí: " + (teJardi ? "Sí" : "No"));
        System.out.println("Piscina: " + (tePiscina ? "Sí" : "No"));
        System.out.println("--------------------");
    }

}
