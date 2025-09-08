package beverages_decorator;

public abstract class BeverageDecorator extends Beverage{

    protected Beverage beverage; // wrap another beverage

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract int cost();
    
}
