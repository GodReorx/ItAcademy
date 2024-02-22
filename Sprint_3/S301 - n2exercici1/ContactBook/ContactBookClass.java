package ContactBook;

import ContactBook.Address.AddressFactory;
import ContactBook.Interfaces.AbstractContactBook;
import ContactBook.Telephone.TelephoneFactory;

public class ContactBookClass {
    public static AbstractContactBook getContact (String typeContact){
        if(typeContact.equalsIgnoreCase("phone")){
            return new TelephoneFactory();
        } else if (typeContact.equalsIgnoreCase("address")) {
            return new AddressFactory();
        }
        return null;
    }
}
