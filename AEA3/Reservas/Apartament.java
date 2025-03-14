package Reservas;

public class Apartament extends Allotjament{

    int habitacions;
    boolean teCuina;

    public Apartament(String nom, int capacitat, boolean disponible, double Calcul_PreuNit, int habitacions, boolean teCuina){
        super(nom, capacitat, disponible, Calcul_PreuNit);
        this.habitacions = habitacions;
        this.teCuina = teCuina;
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

    public void setTeCuina(boolean teCuina) {
        this.teCuina = teCuina;
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
        System.out.println("Apartament: " + nom + " (Habitacions: " + habitacions + ", Cuina: " + (teCuina ? "Sí" : "No") + ") " + (Disponible ? "- Disponible" : "No disponible") );
    }
}
