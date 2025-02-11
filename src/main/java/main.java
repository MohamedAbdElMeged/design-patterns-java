//public class main {
//    // OPEN CLOSED
////    public static void main(String[] args){
////        Order order = new Order();
////        order.setName("electronics");
////        Payment payment = new Payment();
////        payment.setType("VISA");
////        PaymentProcessor paymentProcessor = new PaymentProcessor(new PaypalPaymentStrategy());
////        paymentProcessor.processPayment(order);
////    }
//
//    // Liskov //Violations
//    public static void main(String[] args){
////        Employee employee = new Employee();
////        employee.setHoursOfWork(10);
////        System.out.println("Employee Parent will be: "+ employee.calculateSalary());
////        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
////        fullTimeEmployee.setHoursOfWork(10);
////        System.out.println("Fulltime Employee Parent will be: "+ fullTimeEmployee.calculateSalary());
//    }
//}
//




// OBSERVER

//import observer.*;
//public class main {
//
//    public static void main(String[] args){
//        Exercise exercise = new Exercise();
//        Client client1 = new Client();
//
//        client1.setName("Ahmed");
//        Client client2 = new Client();
//
//        client2.setName("Mohamed");
//        exercise.subscribe(EventType.NEW_BLOG_POST,client1);
//        exercise.subscribe(EventType.NEWSLETTER_WEEKLY,client2);
//
//        exercise.addNewPost(new Post("Helo dfvfddbdfbd"));
//        exercise.addNewsLetter(new NewsLetter("test news letter"));
//
//    }
//}
//


// OBSERVER Exercise
//
//import observer_stock_monitor.*;
//public class main {
//
//    public static void main(String[] args){
//        StockMarket stockMarket = new StockMarket();
//        Customer customer1 = new Customer("Ahmed");
//        stockMarket.subscribe(EventType.AAPL,customer1);
//        Customer customer2 = new Customer("Mohamed");
//        stockMarket.subscribe(EventType.GOOG, customer2);
//
//        stockMarket.addNewStockQuery(new StockQuery("AAPL", 220.23));
//        stockMarket.addNewStockQuery(new StockQuery("MSFT", 210.25));
//        stockMarket.addNewStockQuery(new StockQuery("GOOG", 135.21));
//
//    }
//}







//STRATEGY NAIVE
//import strategy.naive.*;
//
//
//public class main {
//
//    public static void main(String[] args){
//       Product wallet = new Product(200.0,"wallet");
//       double walletPrice = wallet.calculatePrice(MembershipType.REGULAR);
//        System.out.println(walletPrice);
//       Product jacket = new Product(100.0,"jacket");
//       double jacketPrice = jacket.calculatePrice(MembershipType.GOLD);
//        System.out.println(jacketPrice);
//        Product mobile = new Product(1000.0, "Mobile");
//        double mobilePrice = mobile.calculatePrice(MembershipType.PREMIUM);
//        System.out.println(mobilePrice);
//
//        Checkout checkout = new Checkout();
//        checkout.processPayment(walletPrice, PaymentMethod.VISA_CARD);
//        checkout.processPayment(jacketPrice,PaymentMethod.PAYPAL);
//        checkout.processPayment(mobilePrice,PaymentMethod.BANK_TRANSFER);
//
//    }
//}




//STRATEGY GOOD
import strategy.good.*;


public class main {

    public static void main(String[] args){

       Product wallet = new Product("wallet",200.0,new RegularPricingStrategy());
       double walletPrice = wallet.calculatePrice();
        System.out.println(walletPrice);
       Product jacket = new Product("jacket",100.0, new GoldPricingStrategy());
       double jacketPrice = jacket.calculatePrice();
        System.out.println(jacketPrice);
        Product mobile = new Product( "Mobile",1000.0,new PremiumPricingStrategy());
        double mobilePrice = mobile.calculatePrice();
        System.out.println(mobilePrice);

        Checkout checkout = new Checkout(new VisaPaymentStrategy());
        checkout.paymentStrategy.processPayment(walletPrice);
        Checkout pcheckout = new Checkout(new PayPalPaymentStrategy());
        pcheckout.paymentStrategy.processPayment(jacketPrice);
        Checkout mcheckout = new Checkout(new BankTransferPaymentStrategy());
        mcheckout.paymentStrategy.processPayment(mobilePrice);

    }
}