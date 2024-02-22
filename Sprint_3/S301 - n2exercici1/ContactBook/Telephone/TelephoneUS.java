package ContactBook.Telephone;

import ContactBook.Interfaces.ITelephone;

public class TelephoneUS implements ITelephone {

    private final String PREFIXUS = "+1";
    private String areaCode;
    private String centralOffice;
    private String lineNumber;

    public TelephoneUS(String areaCode, String centralOffice, String lineNumber){
        this.areaCode = areaCode;
        this.centralOffice = centralOffice;
        this.lineNumber = lineNumber;
    }

    @Override
    public void call() {
        System.out.println("Calling to " + PREFIXUS + "(" + areaCode + ") " + centralOffice + "-" + lineNumber);
    }
}
