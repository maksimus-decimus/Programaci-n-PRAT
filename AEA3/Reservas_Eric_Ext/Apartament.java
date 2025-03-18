package Reservas_Eric_Ext;

public class Apartament extends Allotjament{
    private int habitacions; 
    private boolean teCuina;
    
    

    public Apartament(String nom, int capacitat, boolean disponibilitat, double PreuNit, int habitacions, boolean teCuina){
        super(nom, capacitat, disponibilitat, PreuNit);
        this.habitacions = habitacions;
        this.teCuina = teCuina;
        setPreuNit(PreuNit); //set perque si no, no fa calcul, nomes agafa el preu de la constructora del main
    }


    public int getHabitacions() {
        return habitacions;
    }
    public void setHabitacions(int habitacions) {
        this.habitacions = habitacions;
    }
    public boolean isTeCuina() {
        return teCuina;
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
    public void setTeCuina(boolean teCuina) {
        this.teCuina = teCuina;
    }  
    
    public double getPreuNit() {
        return PreuNit;
    }

    public void setPreuNit(double PreuNit) {
        this.PreuNit = PreuNit + (habitacions * 10); // por cada habitación, 10 euros
    }

    @Override
    public void mostrarInformacio(){
        System.out.println("--------------------");
        System.out.println("Nom: " + nom);
        System.out.println("Capacitat: " + capacitat);
        System.out.println((disponibilitat ? "Disponible" : "No disponible"));
        System.out.println("Preu per nit: " + PreuNit + " euros");
        System.out.println("Habitacions: " + habitacions);
        System.out.println("Cuina: " + (teCuina ? "Sí" : "No"));
        System.out.println("--------------------");
    }

}
