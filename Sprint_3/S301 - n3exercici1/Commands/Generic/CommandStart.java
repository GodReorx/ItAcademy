package Commands.Generic;

import Commands.Command;
import Vehicles.Vehicle;

public class CommandStart implements Command {

    private Vehicle vehicle;
    public CommandStart(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.start();
    }

    @Override
    public void undo() {
        vehicle.stop();
    }
}
