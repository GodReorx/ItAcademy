package ContactBook.Telephone;

import ContactBook.Interfaces.AbstractContactBook;
import ContactBook.Interfaces.IAddress;
import ContactBook.Interfaces.ITelephone;

public class TelephoneFactory implements AbstractContactBook {

    @Override
    public <T> ITelephone addTelephone(T... t) {
        if(t[0].toString().equalsIgnoreCase("ES")){
            return new TelephoneSpain(Integer.parseInt(t[1].toString()));
        }
        if(t[0].toString().equalsIgnoreCase("UK")){
            return new TelephoneUK(t[1].toString(),t[2].toString());
        }
        if(t[0].toString().equalsIgnoreCase("US")){
            return new TelephoneUS(t[1].toString(),t[2].toString(),t[3].toString());
        }
        return null;
    }

    @Override
    public <T> IAddress addAddress(T... t) {
        return null;
    }
}
