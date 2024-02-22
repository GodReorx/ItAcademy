import Parking.ConfigParking;
import Parking.ParkingControl;

public class App {
    public static void main(String[] args){
        startApp();
    }
    private static void startApp(){
        ParkingControl parking = new ParkingControl();
        ConfigParking.configurate(parking);
        useBike(parking);
        useCar(parking);
        useShip(parking);
        usePlane(parking);

    }
    private static void useBike(ParkingControl parking){
        System.out.println("Bike commands START\n");
        parking.useSlotB1();
        parking.useSlotB2();
        parking.useSlotB3();
        parking.useSlotB4();
        parking.useSlotUndo();
        System.out.println("\nBike commands END\n\n");
    }

    private static void useCar(ParkingControl parking){
        System.out.println("Car commands START\n");
        parking.useSlotC1();
        parking.useSlotC2();
        parking.useSlotUndo();
        parking.useSlotC3();
        parking.useSlotC4();
        System.out.println("\nCar commands END\n\n");
    }

    private static void useShip(ParkingControl parking){
        System.out.println("Ship commands START\n");
        parking.useSlotS1();
        parking.useSlotUndo();
        parking.useSlotS2();
        parking.useSlotS3();
        parking.useSlotS4();
        System.out.println("\nShip commands END\n\n");
    }

    private static void usePlane(ParkingControl parking){
        System.out.println("Plane commands START\n");
        parking.useSlotP1();
        parking.useSlotP2();
        parking.useSlotP3();
        parking.useSlotUndo();
        parking.useSlotP4();
        System.out.println("\nPlane commands END\n\n");
    }
}
