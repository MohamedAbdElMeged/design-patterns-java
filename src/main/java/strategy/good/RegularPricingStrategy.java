package strategy.good;

public class RegularPricingStrategy implements PricingStrategy{
    @Override
    public double calculatePrice(double price) {
        return price;
    }
}
