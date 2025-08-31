public enum ShipmentState implements ShippingCost {
    STANDARD {
        @Override
        public double caclulate(double weightKg) {
            return 50 + 5 * weightKg;
        }
    },
    EXPRESS {
        @Override
        public double caclulate(double weightKg) {
            return 80 + 8 * weightKg;
        }
    },
    OVERNIGHT {
        @Override
        public double caclulate(double weightKg) {
            return 120 + 10 * weightKg;
        }
    };

    // this is violating SRP , as there are more than one reason to modify this file 

    // could work on small list of enums

    // 

}
