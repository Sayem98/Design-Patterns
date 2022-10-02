public class MicroCar extends Car{
    public MicroCar(Location location){
        super(CarType.MICRO, location);
        Construct();
    }
    @Override
    protected void Construct() {
        System.out.println("Connecting to Micro Car");
    }
}

