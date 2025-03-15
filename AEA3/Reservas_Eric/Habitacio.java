package Reservas_Eric;

public class Habitacio extends Allotjament{
    private int numLlits;
    


    public Habitacio(String nom, int capacitat, boolean disponibilitat, double PreuNit, int numLlits){
        super(nom, capacitat, disponibilitat, PreuNit);
        this.numLlits = numLlits;
    }


    public int getNumLlits() {
        return numLlits;
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

    public void setNumLlits(int numLlits) {
        this.numLlits = numLlits;
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
        System.out.println((disponibilitat ? "Disponible":"No Disponible" ));
        System.out.println("Preu per nit: " + PreuNit);
        System.out.println("Nombre de llits: " + numLlits);
        System.out.println("--------------------");

    }
    
    





}
