public class Voiture {

    protected String Nom = "";
    protected String Occupation = "[Disponible]";
    protected String Responsable = "";
    protected String Client = "";
    protected String Cours = "";
    protected String Date = "";

    public Voiture(String nom) {
        this.Nom = nom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        this.Nom = nom;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        this.Occupation = occupation;
    }

    public String getResponsable() {
        return this.Responsable;
    }

    public void setResponsable(String enseignant) {
        this.Responsable = enseignant;
    }

    public String getClient() {
        return this.Client;
    }

    public void setClient(String classe) {
        this.Client = classe;
    }

    public String getCours() {
        return this.Cours;
    }

    public void setCours(String cours) {
        this.Cours = cours;
    }

    public String getDate() {
        return this.Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }
}

