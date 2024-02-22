package Commands.Generic;

import Commands.Command;
import Vehicles.Vehicle;

public class CommandBrake implements Command {

    private Vehicle vehicle;
    public CommandBrake(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.brake();
    }

    @Override
    public void undo() {
        vehicle.speedUp();
    }
}
