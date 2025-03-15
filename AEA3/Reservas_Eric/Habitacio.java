package Reservas_Eric;

public class Habitacio extends Allotjament{
    private int numLlits;
    


    public Habitacio(String nom, int capacitat, boolean disponibilitat, double PreuNit, int numLlits){
        super(nom, capacitat, disponibilitat, PreuNit);
        this.numLlits = numLlits;
        setPreuNit(PreuNit); //set perque si no, no fa calcul, nomes agafa el preu de la constructora del main
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
        if (this.numLlits > 3) { //si supera más de 3 camas, se añaden 20 euros
            this.PreuNit = PreuNit + (this.numLlits - 3) * 20;
        } else {
            this.PreuNit = PreuNit;
        }
       
    }

    @Override
    public void mostrarInformacio(){
        System.out.println("--------------------");
        System.out.println("Nom: " + nom);
        System.out.println("Capacitat: " + capacitat);
        System.out.println((disponibilitat ? "Disponible":"No Disponible" ));
        System.out.println("Preu per nit: " + PreuNit + " euros");
        System.out.println("Nombre de llits: " + numLlits);
        System.out.println("--------------------");

    }
    
    





}
