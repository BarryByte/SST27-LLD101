public class Demo01 {
    public static void main(String[] args) {
        INotificationSender emailClient = new EmailClient();
        OrderService orderService = new OrderService(emailClient);
        orderService.checkout("a@shop.com", 100.0);
    }
}
