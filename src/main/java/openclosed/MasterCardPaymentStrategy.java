package openclosed;

public class MasterCardPaymentStrategy  implements PaymentStrategy{
    @Override
    public void processPayment(Order order) {
        System.out.println("Processing openclosed.Payment using MASTER_CARD strategy");
    }
}
