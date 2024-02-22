package Vehicles;

public class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike: Engine ON!");
    }
    public void speedUp(){
        System.out.println("The bike is accelerating");
    }
    public void brake(){
        System.out.println("The bike is slowing down");
    }
    public void stop(){
        System.out.println("Bike: Engine OFF!");
    }
}
