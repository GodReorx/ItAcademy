package es.zapatitos;

public class Client implements Callback {
    private String client;
    private String paymentMethod;

    public Client(String client, String paymentMethod){
        this.client = client;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String getClient() {
        return client;
    }
    @Override
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public void onCallback() {
        System.out.println("Payment do it.");
    }
}
