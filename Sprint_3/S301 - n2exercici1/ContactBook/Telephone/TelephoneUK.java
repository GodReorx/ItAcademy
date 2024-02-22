package ContactBook.Telephone;

import ContactBook.Interfaces.ITelephone;

public class TelephoneUK implements ITelephone {

    private final String PREFIXUK = "+44";
    private String areaCode;
    private String subsNumber;

    public TelephoneUK(String areaCode, String subsNumber){
        this.areaCode = areaCode;
        this.subsNumber = subsNumber;
    }

    @Override
    public void call() {
        System.out.println("Calling to " + PREFIXUK + " " + areaCode + " " + subsNumber);
    }
}
