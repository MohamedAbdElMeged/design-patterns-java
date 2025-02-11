package strategy_exercise;

public class EmailNotificationSenderStrategy implements NotificationSenderStrategy{
    @Override
    public void sendNotification(String user, String message) {
        System.out.println("Sending EMAIL to user: " + user + " message: "+ message);
    }
}
