package openclosed;

public class VisaPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(Order order) {
        System.out.println("Processing openclosed.Payment using VISA Strategy");
    }
}
