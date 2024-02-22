package ContactBook.Address;

import ContactBook.Interfaces.AbstractContactBook;
import ContactBook.Interfaces.IAddress;
import ContactBook.Interfaces.ITelephone;

public class AddressFactory implements AbstractContactBook {

    @Override
    public <T> ITelephone addTelephone(T... t) {
        return null;
    }

    @Override
    public <T> IAddress addAddress(T... t) {
        if(t[0].toString().equalsIgnoreCase("ES")){
            return new AddressES(t[1].toString(),t[2].toString(),t[3].toString(),Integer.parseInt(t[4].toString()),Integer.parseInt(t[5].toString()),Integer.parseInt(t[6].toString()),t[7].toString(),t[8].toString());
        } else if (t[0].toString().equalsIgnoreCase("UK")) {
            return new AddressUK(t[1].toString(), Integer.parseInt(t[2].toString()), t[3].toString(), t[4].toString(), t[5].toString(), t[6].toString());
        } else if (t[0].toString().equalsIgnoreCase("US")) {
            return new AddressUS(t[1].toString(), t[2].toString(), t[3].toString(), t[4].toString(), t[5].toString());
        }
        return null;
    }
}
