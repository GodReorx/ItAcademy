package Clases;

import java.util.ArrayList;
import java.util.Objects;

public class Redactores {
    private String nombre;
    private final String dni;
    private static double sueldo;
    private ArrayList<Noticias> noticias;
    public Redactores (String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
        this.noticias = new ArrayList<Noticias>();
        this.sueldo = 1500;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    public static double getSueldo() {
        return sueldo;
    }
    public ArrayList<Noticias> getNoticias() {
        return noticias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static void setSueldo(double sueldo) {
        Redactores.sueldo = sueldo;
    }
    public void setNoticias(ArrayList<Noticias> noticias) {
        this.noticias = noticias;
    }

}
