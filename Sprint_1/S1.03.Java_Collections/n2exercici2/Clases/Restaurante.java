package Clases;

import java.util.Objects;

public class Restaurante implements Comparable<Restaurante> {
    private String name;
    private int score;

    public Restaurante(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.name.toUpperCase() + ", puntuación: " + this.score;
    }

    @Override
    public int compareTo(Restaurante o) {
        int compare = this.getName().compareToIgnoreCase(o.getName());
        if(compare > 0){
            return 1;
        } else if (compare < 0){
            return -1;
        } else {
            if (this.getScore() > o.getScore()) {
                return -1;
            } else if (this.getScore() < o.getScore()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
