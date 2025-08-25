class Aviary {
    public void release(IFlyer b) {
        b.fly();
        System.out.println("Released");
    }
}