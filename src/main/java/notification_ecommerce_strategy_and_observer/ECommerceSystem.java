package notification_ecommerce_strategy_and_observer;

import java.util.*;

public class ECommerceSystem {

    public Map<NotificationType,List<Subscriber>> subscribers;
    public List<Product> products;

    public ECommerceSystem() {
        this.subscribers = new HashMap<>();
        this.products = new ArrayList<>();

        initSubscribers();
    }
    public void initSubscribers(){
        Arrays.stream(NotificationType.values()).toList().forEach(notificationType ->
                this.subscribers.put(notificationType,new ArrayList<>())
                );
    }

    public void addProduct(Product product){
        this.products.add(product);
        notifySubscribers(NotificationType.NEW_PRODUCT, "New Product Added: "+ product.getName() +
                " with price: "+ product.getPrice());
    }

    public void changePrice(Product product, double newPrice){
        String message = "Product "+ product.getName() + " price changed from "+ product.getPrice() + " to "+ newPrice;
        this.products.remove(product);
        product.setPrice(newPrice);
        this.products.add(product);
        notifySubscribers(NotificationType.PRICE_CHANGED, message);

    }

    public void subscribe(NotificationType notificationType, Subscriber subscriber){
        this.subscribers.get(notificationType).add(subscriber);
    }
    public void unsubscribe(NotificationType notificationType, Subscriber subscriber){
        this.subscribers.get(notificationType).remove(subscriber);
    }
    public void notifySubscribers(NotificationType notificationType, String message){
        this.subscribers.get(notificationType).forEach(subscriber ->
                subscriber.notify(message)
                );
    }
}
