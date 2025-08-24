public class ShippingCostCalculator {
    double cost(Shipment s){
        return s.getState().caclulate(s.getWeightKg());
    }
}
