package strategy.good;

public class VisaPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("VISA PROCESS PAYMENT for amount: "+ amount);
    }
}
