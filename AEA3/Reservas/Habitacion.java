package Reservas;

public class Habitacion extends Allotjament{

    int Llits;


    public Habitacion(String nom, int capacitat, boolean disponible, double Calcul_PreuNit, int Llits){
        super(nom, capacitat, disponible, Calcul_PreuNit);
        this.Llits = Llits;
    }
    
    public int getLlits() {
        return Llits;
    }

    public void setLlits(int llits) {
        Llits = llits;
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
        
        System.out.println("Habitació: " + nom + " (Llits: " + Llits + ") " + (Disponible ? "- Disponible" : "No disponible"));
    }

    

}
