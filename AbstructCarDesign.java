public class AbstructCarDesign {
    public static void main(String[] args) {
        System.out.println(CarFactory.BuildCar(CarType.MICRO));
        System.out.println(CarFactory.BuildCar(CarType.MINI));
        System.out.println(CarFactory.BuildCar(CarType.LUXURY));
    }
}
