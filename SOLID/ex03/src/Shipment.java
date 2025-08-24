public class Shipment {
    ShipmentState state;
    double weightKg;

    Shipment(ShipmentState state, double weightKg){
        this.state = state;
        this.weightKg = weightKg; 
    }

    ShipmentState getState(){
        return state;
    }

    double getWeightKg(){
        return weightKg;
    }
}