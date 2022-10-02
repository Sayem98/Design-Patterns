public class USACarFactory {
    static Car BuildCar(CarType model){
        Car car = null;
        switch(model){
            case MICRO:
                car = new MicroCar(Location.USA);
                break;
            case MINI:
                car = new MiniCar(Location.USA);
                break;
            case LUXURY:
                car = new LaxaryCar(Location.USA);
                break;
            default:
                break;
        }
        return car;
    }
}
