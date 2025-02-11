package notification_ecommerce_strategy_and_observer;

public interface NotificationSenderStrategy {
    public void sendMessage(String customerName, String message );
}
