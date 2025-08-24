public enum PaymentType implements IPaymentType {
    CARD{

        @Override
        public String charge(Payment p ) {
            return "Charged card: " + p.getAmount();
        }
        
    },
    UPI{

        @Override
        public String charge(Payment p ) {
            return "Paid via UPI: " + p.getAmount();
        }

    },
    WALLET{

        @Override
        public String charge(Payment p ) {
           return "Wallet debit: " + p.getAmount();
        }

    }
}
