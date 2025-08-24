public class OrderService {
    // EmailClient email = new EmailClient();
    Utility utility;
    INotificationSender notificationSender;

    public OrderService(INotificationSender notificationSender,Utility utility){
        this.notificationSender = notificationSender; 
        this.utility = utility;
    }
    
    void checkout(String customerEmail, double subtotal) {
        double total = utility.totalWithTax(subtotal);
        notificationSender.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}