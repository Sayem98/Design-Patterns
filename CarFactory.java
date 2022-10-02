public class CarFactory {
    private CarFactory() {
    }
    public static Car BuildCar(CarType model){
        Car car = null;
        Location location = Location.INDIA;
        switch(location){
            case USA:
                car = USACarFactory.BuildCar(model);
                break;
            case INDIA:
                car = IndiaCarFactory.BuildCar(model);
                break;
            default:
                car = DefaultCarFactory.BuildCar(model);
                break;
        }
        return car;
        
    }
}
