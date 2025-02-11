package strategy.good;

public class PayPalPaymentStrategy  implements PaymentStrategy
{
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL PROCESS PAYMENT FOR AMOUNT: "+ amount);
    }
}
