public class OrderService {
    double taxRate = 0.18;
    // EmailClient email = new EmailClient();
    INotificationSender notificationSender;

    public OrderService(INotificationSender notificationSender){
        this.notificationSender = notificationSender; 
    }

    double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
    void checkout(String customerEmail, double subtotal) {
        double total = totalWithTax(subtotal);
        notificationSender.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}