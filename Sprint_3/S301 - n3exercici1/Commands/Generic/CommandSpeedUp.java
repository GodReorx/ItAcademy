package Commands.Generic;

import Commands.Command;
import Vehicles.Vehicle;

public class CommandSpeedUp implements Command {

    private Vehicle vehicle;
    public CommandSpeedUp(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.speedUp();
    }

    @Override
    public void undo() {
        vehicle.brake();
    }
}
