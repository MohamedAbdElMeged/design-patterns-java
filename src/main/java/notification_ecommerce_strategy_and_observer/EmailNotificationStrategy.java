package notification_ecommerce_strategy_and_observer;

public class EmailNotificationStrategy implements  NotificationSenderStrategy{

    @Override
    public void sendMessage(String customerName, String message) {
        System.out.println("SEND EMAIL MESSAGE TO "+ customerName + " For message "+ message);
    }
}
