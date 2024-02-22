package Parking;

import Commands.Generic.*;
import Vehicles.*;

public class ConfigParking {

    public static void configurate(ParkingControl pc){
        Car car = new Car();
        Bike bike = new Bike();
        Plane plane = new Plane();
        Ship ship = new Ship();

        pc.setSlotC1(new CommandStart(car));
        pc.setSlotC2(new CommandSpeedUp(car));
        pc.setSlotC3(new CommandBrake(car));
        pc.setSlotC4(new CommandStop(car));

        pc.setSlotB1(new CommandStart(bike));
        pc.setSlotB2(new CommandSpeedUp(bike));
        pc.setSlotB3(new CommandBrake(bike));
        pc.setSlotB4(new CommandStop(bike));

        pc.setSlotP1(new CommandStart(plane));
        pc.setSlotP2(new CommandSpeedUp(plane));
        pc.setSlotP3(new CommandBrake(plane));
        pc.setSlotP4(new CommandStop(plane));

        pc.setSlotS1(new CommandStart(ship));
        pc.setSlotS2(new CommandSpeedUp(ship));
        pc.setSlotS3(new CommandBrake(ship));
        pc.setSlotS4(new CommandStop(ship));
    }
}
