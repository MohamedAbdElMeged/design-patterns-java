package notification_ecommerce_strategy_and_observer;

public class SmsNotificationStrategy implements NotificationSenderStrategy{
    @Override
    public void sendMessage(String customerName, String message) {
        System.out.println("SEND SMS MESSAGE TO "+ customerName + " For message "+ message);
    }
}
