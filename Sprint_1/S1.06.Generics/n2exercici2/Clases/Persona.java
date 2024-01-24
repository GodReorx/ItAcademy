package Clases;

public class Persona {
    String nom;
    String cognom;
    int edad;

    public Persona(String nom, String cognom, int edad){
        this.nom = nom;
        this.cognom = cognom;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nom + " Cognom: " + this.cognom + " Edad: " + this.edad;
    }
}