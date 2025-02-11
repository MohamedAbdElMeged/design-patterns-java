package strategy.naive;

public class Checkout {
    public void processPayment(double amount, PaymentMethod paymentMethod){
        if (paymentMethod.equals(PaymentMethod.VISA_CARD)){
            System.out.println("processing payment of visa card");
            System.out.println("calculating fees of the amount for visa card...");
        }else if (paymentMethod.equals(PaymentMethod.PAYPAL)){
            System.out.println("processing payment of paypal");
            System.out.println("calculating fees of the amount for paypal...");
        }else if (paymentMethod.equals(PaymentMethod.BANK_TRANSFER)){
            System.out.println("processing payment of BANK_TRANSFER");
        }
    }
}
