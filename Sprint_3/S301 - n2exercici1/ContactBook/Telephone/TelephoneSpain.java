package ContactBook.Telephone;

import ContactBook.Interfaces.ITelephone;

public class TelephoneSpain  implements ITelephone {

    private static int telephoneNumber;
    private final String PREFIXES = "+34";

    public TelephoneSpain(int telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }

    public static int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public void call() {
        System.out.println("Llamado a " + PREFIXES + " " + telephoneNumber);
    }
}
