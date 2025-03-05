package Herencias;

public class Persona {

    private static int id;

    int edat;

    String adreça;

    String nom;

    String cognom;

    public Persona(int id, int edat, String adreça, String nom, String cognom){
        this.setId(id);
        this.setEdat(edat);
        this.setAdreça(adreça);
        this.setNom(nom);
        this.setCognom(cognom);
    }


    public Persona (int id, String nom, String cognom){
        this.setId(id);
        this.setNom(nom);
        this.setCognom(cognom);
    }

    public Persona(){
        //++id;
    }

    public int getId() {
        return id;
    }

    public void setId(int nId) {
        id = nId;
    }

    public void setEdat(int nEdat) {
        edat = nEdat;
    }

     public int getEdat(){
        return edat;
    }


    public void setAdreça(String nAdreça) {
        adreça = nAdreça;
    }


    public String getAdreça(){
        return adreça;
    }

    
    public void setNom(String nNom) {
        nom = nNom;
    }

    public String getNom(){
        return nom;
    }


    public void setCognom(String nCognom) {
        cognom = nCognom;
    }
    
    public String getCognom(){
        return cognom;
    }


    public void Imprimir() {
        System.out.println("Dades personals:");
        System.out.println("Id: " + getId());
        System.out.println("Edat: " + getEdat());
        System.out.println("Adreça: " + getAdreça());
        System.out.println("Nom: " + getNom());
        System.out.println("Cognom: " + getCognom());
    }
}
