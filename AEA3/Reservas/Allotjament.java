package Reservas;

public class Allotjament {

public String nom;
public int capacitat;
public boolean Disponible;
public double Calcul_PreuNit;


Allotjament(){

}

public Allotjament(String nom, int capacitat, boolean disponible, double Calcul_PreuNit){
    this.nom = nom;
    this.capacitat = capacitat;
    this.Disponible = disponible;
    this.Calcul_PreuNit = Calcul_PreuNit;
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

public boolean isDisponible() {
    return Disponible;
}

public void setDisponible(boolean disponible) {
    Disponible = disponible;
}

public double getCalcul_PreuNit() {
    return Calcul_PreuNit;
}

public void setCalcul_PreuNit(double Calcul_PreuNit) {
    this.Calcul_PreuNit = Calcul_PreuNit;
}


public boolean reservar(){
    if (Disponible){
        Disponible = false;
        System.out.println("Reserva exitosa");
        return true;
        
        
    } else {
        System.out.println("No està disponible per reserves");
        return false;
        
    }
}

public boolean alliberar(){
    if (!Disponible){
        Disponible = true;
        System.out.println("Alliberació exitosa");
        return true;
        
        
    } else {
        System.out.println("Aquest allotjament no està reservat!!");
        return false;
        
    }
}

public void Mostrar_informacio(){
    System.out.println();
    System.out.println("Nom: " + nom + "\nLa capacitat és: " + capacitat + "\nL'estat de reserva és: " + Disponible + "\nEl preu de la nit és: " + Calcul_PreuNit);
}

    
}


