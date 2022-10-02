public class DefaultCarFactory {
    static Car BuildCar(CarType model){
        Car car = null;
        switch(model){
            case MICRO:
                car = new MicroCar(Location.DEFAULT);
                break;
            case MINI:
                car = new MiniCar(Location.DEFAULT);
                break;
            case LUXURY:
                car = new LaxaryCar(Location.DEFAULT);
                break;
            default:
                break;
        }
        return car;
    }
}

