package strategy_exercise;

public class SmsNotificationSenderStrategy implements NotificationSenderStrategy {
    @Override
    public void sendNotification(String user, String message) {
        System.out.println("Sending SMS to user: " + user + " message: "+ message);
    }
}
