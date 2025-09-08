package beverages_decorator;

public class Client {
    public static void main(String[] args) {
        Beverage coffee = new Cappuccino(); // base drink
        System.out.println("Plain Cappuccino cost: " + coffee.cost());

        // add milk
        coffee = new MilkDecorator(coffee);
        System.out.println("Cappuccino + Milk cost: " + coffee.cost());

        // add chocolate 
        coffee = new ChocolateDecorator(coffee);
        System.out.println("Cappuccino + Milk + Chocolate cost: " + coffee.cost());
    }
}
