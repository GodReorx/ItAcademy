package ContactBook.Address;

import ContactBook.Interfaces.IAddress;

public class AddressES implements IAddress {

    private String name;
    private String lastName;
    private String streetName;
    private int numHouse;
    private int floor;
    private int door;
    private String postalCode;
    private String city;
    private final String COUNTRY = "Spain";

    public AddressES(String name, String lastName, String streetName, int numHouse, int floor, int door, String postalCode, String city) {
        this.name = name;
        this.lastName = lastName;
        this.streetName = streetName;
        this.numHouse = numHouse;
        this.floor = floor;
        this.door = door;
        this.postalCode = postalCode;
        this.city = city;
    }

    @Override
    public void send() {
        System.out.println("Carta enviada a " + name + " " + lastName + ", " + streetName + " " + numHouse + ", " + floor + " " + door + ", " + postalCode + " " + city + " " + COUNTRY);
    }
}
