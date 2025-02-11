package observer;

public class Client implements Subscriber {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println("User: " + name +" is notified for message:" + message);
    }
}


