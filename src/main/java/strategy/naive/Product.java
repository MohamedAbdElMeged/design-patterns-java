package strategy.naive;

public class Product {
    private String name;
    private double price;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double calculatePrice(MembershipType membershipType){
        if (membershipType.equals(MembershipType.REGULAR)){
            return price;
        }else if (membershipType.equals(MembershipType.GOLD)){
            return price * 0.9;
        }else if(membershipType.equals(MembershipType.PREMIUM)){
            return price * 0.8;
        }
        return price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
