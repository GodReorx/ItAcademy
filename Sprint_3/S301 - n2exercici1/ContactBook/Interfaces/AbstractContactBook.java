package ContactBook.Interfaces;

public interface AbstractContactBook {

    <T> ITelephone addTelephone(T... t);

    <T> IAddress addAddress(T... t);
}
