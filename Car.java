enum CarType{
    MICRO, MINI, LUXURY
}
enum Location
{
  DEFAULT, USA, INDIA
}
abstract class Car{
    Car(CarType model, Location location){
        this.model = model;
        this.location = location;
    }

    abstract void Construct();

    CarType model = null;
    Location location = null;

    void SetModel(CarType model){
        this.model = model;
    }
    CarType GetModel(){
        return model;
    }
    Location GetLocation(){
        return location;
    }

    void SetLocation(Location location){
        this.location = location;
    }
    @Override
    public String toString(){
        return "CarModel - "+model + " located in "+location;
    }
}