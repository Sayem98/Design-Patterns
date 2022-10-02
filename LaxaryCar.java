public class LaxaryCar extends Car{
    public LaxaryCar(Location location){
        super(CarType.LUXURY, location);
        Construct();
    }
    @Override
    protected void Construct() {
        System.out.println("Connecting to Laxary Car");
    }
}



