package observer_stock_monitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockMarket {
    private Map<EventType,List<Subscriber>> subscribers;
    private List<StockQuery> stockQueries;

    public StockMarket() {
        this.stockQueries = new ArrayList<>();
        this.subscribers = new HashMap<>();
        initSubscribingEvents();
    }
    public void initSubscribingEvents(){
        for (EventType value : EventType.values()) {
            subscribers.put(value,new ArrayList<>());
        }
    }

    // subscribe
    public void subscribe(EventType eventType, Subscriber subscriber){
        this.subscribers.get(eventType).add(subscriber);
    }
    public void unsubscribe(EventType eventType,Subscriber subscriber){
        this.subscribers.get(eventType).remove(subscriber);
    }

    public void addNewStockQuery(StockQuery stockQuery){
        this.stockQueries.add(stockQuery);
        notifySubscribers(EventType.valueOf(stockQuery.getStockCode()), "Stock: "+
                stockQuery.getStockCode() + " reached price: "+ stockQuery.getPrice());
    }

    public void notifySubscribers(EventType eventType, String message){
        this.subscribers.get(eventType).forEach(subscriber -> subscriber.notify(message));
    }

}
