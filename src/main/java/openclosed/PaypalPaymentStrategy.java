package openclosed;

public class PaypalPaymentStrategy implements PaymentStrategy{


    @Override
    public void processPayment(Order order) {
        System.out.println("Process openclosed.Payment using paypal ");
    }
}
