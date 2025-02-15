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
//import strategy.good.*;
//
//
//public class main {
//
//    public static void main(String[] args){
//
//       Product wallet = new Product("wallet",200.0,new RegularPricingStrategy());
//       double walletPrice = wallet.calculatePrice();
//        System.out.println(walletPrice);
//       Product jacket = new Product("jacket",100.0, new GoldPricingStrategy());
//       double jacketPrice = jacket.calculatePrice();
//        System.out.println(jacketPrice);
//        Product mobile = new Product( "Mobile",1000.0,new PremiumPricingStrategy());
//        double mobilePrice = mobile.calculatePrice();
//        System.out.println(mobilePrice);
//
//        Checkout checkout = new Checkout(new VisaPaymentStrategy());
//        checkout.paymentStrategy.processPayment(walletPrice);
//        Checkout pcheckout = new Checkout(new PayPalPaymentStrategy());
//        pcheckout.paymentStrategy.processPayment(jacketPrice);
//        Checkout mcheckout = new Checkout(new BankTransferPaymentStrategy());
//        mcheckout.paymentStrategy.processPayment(mobilePrice);
//
//    }
//}


//notification_ecommerce_strategy_and_observer
//import notification_ecommerce_strategy_and_observer.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class main {
//
//    public static void main(String[] args) {
//        ECommerceSystem eCommerceSystem = new ECommerceSystem();
//        List<NotificationSenderStrategy>  notificationSenderStrategies = new ArrayList<>();
//        notificationSenderStrategies.add(new EmailNotificationStrategy());
//        notificationSenderStrategies.add(new SmsNotificationStrategy());
//        Customer customer1 = new Customer("mohamed",notificationSenderStrategies);
//
//
//        List<NotificationSenderStrategy>  customer2NotificationSenderStrategies = new ArrayList<>();
//        customer2NotificationSenderStrategies.add(new EmailNotificationStrategy());
//        Customer customer2 = new Customer("ahmed",customer2NotificationSenderStrategies);
//
//        List<NotificationSenderStrategy>  customer3NotificationSenderStrategies = new ArrayList<>();
//        customer3NotificationSenderStrategies.add(new SmsNotificationStrategy());
//        Customer customer3 = new Customer("Maged",customer3NotificationSenderStrategies);
//
//
//        eCommerceSystem.subscribe(NotificationType.NEW_PRODUCT,customer1);
//        eCommerceSystem.subscribe(NotificationType.NEW_PRODUCT,customer2);
//        eCommerceSystem.subscribe(NotificationType.PRICE_CHANGED,customer3);
//
//        Product product = new Product("mobile", 1000.20);
//        eCommerceSystem.addProduct(product);
//
//
//        eCommerceSystem.changePrice(product, 2500.50);
//
//
//    }
//
//}

//import template_method.violation.*;
//// template method violation
//public class main {
//
//    public static void main(String[] args) {
//        CVReportGeneration pdfCvReportGeneration = new PdfCVReportGeneration();
//        GeneratedReport pdfGeneratedReport = pdfCvReportGeneration.generateCVReport("/tmp/1.pdf");
//        System.out.println(pdfGeneratedReport.isPassed());
//
//        CVReportGeneration wordCVReportGeneration = new WordCVReportGeneration();
//        GeneratedReport wordGeneratedReport = wordCVReportGeneration.generateCVReport("/tmp/1.word");
//        System.out.println(wordGeneratedReport.isPassed());
//
//
//        CVReportGeneration imgCVReportGeneration = new ImageCVReportGeneration();
//        GeneratedReport imgGeneratedReport = imgCVReportGeneration.generateCVReport("/tmp/1.jpeg");
//        System.out.println(imgGeneratedReport.isPassed());
//
//    }
//
//
//}



//import template_method.good.*;
//// template method good
//public class main {
//
//    public static void main(String[] args) {
//        CVReportGeneration pdfCvReportGeneration = new PdfCVReportGeneration();
//        GeneratedReport pdfGeneratedReport = pdfCvReportGeneration.generateCVReport("/tmp/1.pdf");
//        System.out.println(pdfGeneratedReport.isPassed());
//
//        CVReportGeneration wordCVReportGeneration = new WordCVReportGeneration();
//        GeneratedReport wordGeneratedReport = wordCVReportGeneration.generateCVReport("/tmp/1.word");
//        System.out.println(wordGeneratedReport.isPassed());
//
//
//        CVReportGeneration imgCVReportGeneration = new ImageCVReportGeneration();
//        GeneratedReport imgGeneratedReport = imgCVReportGeneration.generateCVReport("/tmp/1.jpeg");
//        System.out.println(imgGeneratedReport.isPassed());
//
//    }
//
//
//}



import template_method.exercise.*;
// template method exercise
public class main {

    public static void main(String[] args) {
        SDVideoEditinhRenderer sdVideoEditinhRenderer = new SDVideoEditinhRenderer();
        sdVideoEditinhRenderer.editVideo();
        HDVideoEditingRenderer hdVideoEditingRenderer = new HDVideoEditingRenderer();
        hdVideoEditingRenderer.editVideo();
        FHDVideoEditingRenderer fhdVideoEditingRenderer = new FHDVideoEditingRenderer();
        fhdVideoEditingRenderer.editVideo();

    }


}


