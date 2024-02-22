package ContactBook.Address;

import ContactBook.Interfaces.IAddress;

public class AddressUK implements IAddress {

    private String addresserName;
    private int numHouse;
    private String streetName;
    private String locality;
    private String town;
    private String postalCode;
    private final String COUNTRY = "United Kingdom";


    public AddressUK(String addresserName, int numHouse, String streetName, String locality, String town, String postalCode) {
        this.addresserName = addresserName;
        this.numHouse = numHouse;
        this.streetName = streetName;
        this.locality = locality;
        this.town = town;
        this.postalCode = postalCode;
    }

    @Override
    public void send() {
        System.out.println("Postcard send to " + addresserName + "\n" +
                numHouse + " " + streetName + "\n" +
                locality + "\n" +
                town.toUpperCase() + "\n" +
                postalCode.toUpperCase() + "\n" +
                COUNTRY);
    }
}
