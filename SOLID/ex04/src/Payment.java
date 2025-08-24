public class Payment {
    PaymentType provider;
    double amount;
    
    Payment(PaymentType provider, double amount){
        this.provider=provider;
        this.amount=amount;
    }

    PaymentType getProvider(){
        return provider;
    }
    double getAmount(){
        return amount;
    }

}