package Vehicles;

public class Ship implements Vehicle {
    public void start(){
        System.out.println("Ship: Engine ON!");
    }
    public void speedUp(){
        System.out.println("The ship is accelerating");
    }
    public void brake(){
        System.out.println("The ship is slowing down");
    }
    public void stop(){
        System.out.println("Ship: Engine OFF!");
    }
}
