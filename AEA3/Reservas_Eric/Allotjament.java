package Reservas_Eric;
public class Allotjament {
    public String nom;
    public int capacitat;
    public boolean disponibilitat;
    public double PreuNit;


    public Allotjament(String nom, int capacitat, boolean disponibilitat, double PreuNit){
        this.nom = nom;
        this.capacitat = capacitat;
        this.disponibilitat = disponibilitat;
        this.PreuNit = PreuNit;
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
    public double calcularPreuPerNit(){
        return 0;
    }
    public void mostrarInformacio(){
        System.out.println("--------------------");
        System.out.println("Nom: " + nom);
        System.out.println("Capacitat: " + capacitat);
        System.out.println((disponibilitat ? "Disponible" : "No disponible"));
        System.out.println("Preu per nit: " + PreuNit+ " euros");
        System.out.println("--------------------");
    }
    public void reservar(){
        if (disponibilitat){
            disponibilitat = false;
            System.out.println("Reservat correctament.");
        }
        else{
            System.out.println("Ja està reservat.");
            
        }
    }
    public void alliberar(){
        if (!disponibilitat){
            disponibilitat = true;
            System.out.println("Alliberat correctament.");
        }
        else {
            System.out.println("No està reservat.");
           
        }   
    }
    public boolean isDisponible(){  
        return disponibilitat;
    }

    public double getPreuNit() {
        return PreuNit;
    }

    public void setPreuNit(double PreuNit) {
        this.PreuNit = PreuNit;
    }

           
        
    
}

    