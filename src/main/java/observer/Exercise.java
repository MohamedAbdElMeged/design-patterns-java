package observer;

import jdk.jfr.Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise {
    private Map<EventType, List<Subscriber>> subscribers;
    private  List<Post> posts;
    private  List<NewsLetter> newsLetters;

    public Exercise(){
        this.subscribers = new HashMap<>();
        initSubscribersEvents();
        this.posts = new ArrayList<>();
        this.newsLetters = new ArrayList<>();
    }

    public void initSubscribersEvents(){
        subscribers.put(EventType.NEW_BLOG_POST,new ArrayList<>());
        subscribers.put(EventType.NEWSLETTER_WEEKLY,new ArrayList<>());

    }

    public void subscribe(EventType eventType, Subscriber subscriber){
        subscribers.get(eventType).add(subscriber);
    }
    public void unsubscribe(EventType eventType, Subscriber subscriber){
        subscribers.get(eventType).remove(subscriber);
    }

    public void addNewPost(Post post){
        posts.add(post);
        notifySubscribers(EventType.NEW_BLOG_POST, "New Post is published " + post.getBody());
    }
    public void notifySubscribers(EventType eventType, String message){
        subscribers.get(eventType).forEach(subscriber -> subscriber.notify(message));
    }

    public void addNewsLetter(NewsLetter newsLetter){
        newsLetters.add(newsLetter);
        notifySubscribers(EventType.NEWSLETTER_WEEKLY, "News Letter weekly added :"+ newsLetter.getNews());
    }

}
