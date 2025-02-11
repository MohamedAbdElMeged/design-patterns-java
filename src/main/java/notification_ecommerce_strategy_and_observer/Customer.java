package notification_ecommerce_strategy_and_observer;

import java.util.List;

public class Customer  implements Subscriber{
    private String name;
    private List<NotificationSenderStrategy> notificationSenderStrategies;

    public Customer(String name, List<NotificationSenderStrategy> notificationSenderStrategies) {
        this.name = name;
        this.notificationSenderStrategies = notificationSenderStrategies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        this.notificationSenderStrategies.forEach(strategy -> strategy.sendMessage(this.name,message));
    }
}
