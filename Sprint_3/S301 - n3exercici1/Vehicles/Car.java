package Vehicles;

public class Car implements Vehicle{
    public void start(){
        System.out.println("Car: Engine ON!");
    }
    public void speedUp(){
        System.out.println("The car is accelerating");
    }
    public void brake(){
        System.out.println("The car is slowing down");
    }
    public void stop(){
        System.out.println("Car: Engine OFF!");
    }
}
