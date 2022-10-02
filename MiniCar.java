public class MiniCar extends Car{
    public MiniCar(Location location){
        super(CarType.MINI, location);
        Construct();
    }
    @Override
    protected void Construct() {
        System.out.println("Connecting to Mini Car");
    }
}
