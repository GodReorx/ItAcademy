import ContactBook.Interfaces.IAddress;
import ContactBook.ContactBookClass;
import ContactBook.Interfaces.ITelephone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<IAddress> addressList = new ArrayList<>();
        ArrayList<ITelephone> phoneList = new ArrayList<>();

        phoneList.add(ContactBookClass.getContact("phone").addTelephone("ES",934567821));
        phoneList.add(ContactBookClass.getContact("phone").addTelephone("US","555","0214","12456"));
        phoneList.add(ContactBookClass.getContact("phone").addTelephone("UK","6547","235698"));

        phoneList.stream().forEach(ITelephone::call);

        addressList.add(ContactBookClass.getContact("address").addAddress("ES","Paco","Palotes","Calle invisible",21,1,5,"07894","Madrid"));
        addressList.add(ContactBookClass.getContact("address").addAddress("UK","Jhon Smith",23,"Baker Street","Downtown","London", "0G1 2Z3"));
        addressList.add(ContactBookClass.getContact("address").addAddress("US","Ronald Dunffy","235, 1st Street","02 Apartment","New York","NY 02587"));

        addressList.stream().forEach(IAddress::send);
    }
}
