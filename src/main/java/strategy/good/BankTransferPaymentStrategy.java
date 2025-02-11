package strategy.good;

public class BankTransferPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("BANK TRANSFER PROCESS PAYMENT FOR AMOUNT: "+ amount);
    }
}
