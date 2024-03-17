package es.zapatitos;

public class PaymentGateway {
    public void doPayment(Callback callback) throws InterruptedException {
        String paymentMethod = callback.getPaymentMethod();
        boolean flag = false;

        System.out.println("Client: " + callback.getClient());
        System.out.println("Use payment method: " +paymentMethod);
        if (paymentMethod.equalsIgnoreCase("credit card")){
            System.out.println("Connecting to your bank...\n" +
                    "Sending your data...");
            flag = true;
        } else if (paymentMethod.equalsIgnoreCase("Paypal")) {
            System.out.println("Connecting to Paypal...\n" +
                    "Check your Paypal ID...");
            flag = true;
        } else if(paymentMethod.equalsIgnoreCase("bank account")){
            System.out.println("Send to your bank the petition for transfer...");
            flag = true;
        } else {
            System.out.println("Incorrect type of payment.");
        }
        String msg = (flag) ? "Information given correct..." : "Canceling the payment process";
        System.out.println(msg);
        Thread.sleep(5000);
        callback.onCallback();
    }
}
