import es.zapatitos.Client;
import es.zapatitos.PaymentGateway;

public class App {
    public static void main(String[] args){
        startApp();
    }

    private static void startApp(){
        PaymentGateway pg = new PaymentGateway();

        try {
            pg.doPayment(new Client("Mike","Credit Card"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
