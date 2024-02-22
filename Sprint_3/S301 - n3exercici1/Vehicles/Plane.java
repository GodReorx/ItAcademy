package Vehicles;

public class Plane implements Vehicle {
    public void start(){
        System.out.println("Plane: Engine ON!");
    }
    public void speedUp(){
        System.out.println("The plane is accelerating");
    }
    public void brake(){
        System.out.println("The plane is slowing down");
    }
    public void stop(){
        System.out.println("Plane: Engine OFF!");
    }
}
