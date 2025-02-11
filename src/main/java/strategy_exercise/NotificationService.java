package strategy_exercise;

public class NotificationService {
    private NotificationSenderStrategy notificationSenderStrategy;

    public NotificationService(NotificationSenderStrategy notificationSenderStrategy) {
        this.notificationSenderStrategy = notificationSenderStrategy;
    }


}
