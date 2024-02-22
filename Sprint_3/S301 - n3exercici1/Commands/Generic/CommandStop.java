package Commands.Generic;

import Commands.Command;
import Vehicles.Vehicle;

public class CommandStop implements Command {

    private Vehicle vehicle;
    public CommandStop(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.stop();
    }

    @Override
    public void undo() {
        vehicle.start();
    }
}
