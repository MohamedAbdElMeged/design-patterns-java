package openclosed;//Violation
//public class openclosed.PaymentProcessor {
//
//    public void processPayment(openclosed.Order order, openclosed.Payment payment){
//        System.out.println("process payment for order: "+ order.getName());
//        if (payment.getType().equalsIgnoreCase("VISA")){
//            System.out.println("Processing Visa Card payment");
//        }else if (payment.getType().equalsIgnoreCase("MASTER_CARD")){
//            System.out.println("Processing Master Card payment");
//        }else{
//            throw new UnsupportedOperationException("Un supported payment...");
//        }
//    }
//}


// GOOD

public class PaymentProcessor{
    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(Order order){
        System.out.println("Process openclosed.Payment Method");
        paymentStrategy.processPayment(order);
    }
}