public class Demo01 {
    public static void main(String[] args) {
        INotificationSender emailClient = new EmailClient();
        Utility utility = new Utility(0.18);
        OrderService orderService = new OrderService(emailClient,utility);
        orderService.checkout("a@shop.com", 100.0);
    }
}
