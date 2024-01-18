package Clases;

public class Restaurante {
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
        return "El restaurante " + this.name + " tiene una puntuacion de " + this.score;
    }
}
