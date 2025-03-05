package Herencias;

public class Estudiant extends Persona{

    String curs;

    String assignatures;

    String escola;

    int nota;

    public Estudiant(int id, String nom, String cognom, String curs, String assignatures, String escola, int nota){
        super(id,nom,cognom);
        this.setCurs(curs);
        this.setAssignatures(assignatures);
        this.setEscola(escola);
        this.setNota(nota);
    }


    public Estudiant(){
        int id = this.getId();
        this.setId(++id);
    }

    public Estudiant(int id){
        this.setId(id);
    }



    public void setCurs(String nCurs) {
        curs = nCurs;
    }

    public String getCurs(){
        return curs;
    }



    public void setAssignatures(String nAssignatures) {
        assignatures = nAssignatures;
    }

    public String getAssignatures(){
        return assignatures;
    }

    
    public void setEscola(String nEscola) {
        escola = nEscola;
    }

    public String getEscola(){
        return escola;
    }


    public void setNota(int nNota) {
        nota = nNota;
    }

    public int getNota(){
        return nota;
    }




    // Own behavior
    private void atributs() {
        System.out.println("Dades personals:");
        System.out.println("Id: " + getId());
        System.out.println("Edat: " + getEdat());
        System.out.println("Adreça: " + getAdreça());
        System.out.println("Nom: " + getNom());
        System.out.println("Cognom: " + getCognom());

        System.out.println();
        System.out.println("Dades de l'estudiant: ");
        System.out.println("Id: " + getId());
        System.out.println("Curs: " + getCurs());
        System.out.println("Assignatures: " + getAssignatures());
        System.out.println("Escola: " + getEscola());
        System.out.println("Nota: " + getNota());
        System.out.println();
    }
    
    // Overriding super class behavior
    @Override
    public void Imprimir() {
        atributs();
    }
}