class Utility{
    final double taxRate;

    public Utility(double taxRate){
        this.taxRate = taxRate;
    }

    double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}