package ContactBook.Address;

import ContactBook.Interfaces.IAddress;

public class AddressUS implements IAddress {

    private String fullName;
    private String streetNumName;
    private  String apartUnit;
    private String city;
    private String postalCode;
    private final String COUNTRY = "USA";

    public AddressUS(String fullName, String streetNumName, String apartUnit, String city, String postalCode) {
        this.fullName = fullName;
        this.streetNumName = streetNumName;
        this.apartUnit = apartUnit;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public void send() {
        System.out.println("Postcard send to " + fullName + "\n" +
                streetNumName + "\n" +
                apartUnit + "\n" +
                city + ", " + postalCode + "\n" +
                COUNTRY);
    }
}
