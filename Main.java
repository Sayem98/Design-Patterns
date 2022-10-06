public class Main {
     public static void main(String args[])
    {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();
  
        // Wrap a bird in a birdAdapter so that it 
        // behaves like toy duck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
  
        System.out.println("Sparrow...");
        sparrow.Fly();
        sparrow.Sing();
  
        System.out.println("ToyDuck...");
        toyDuck.Squeak();
  
       
        System.out.println("BirdAdapter...");
        birdAdapter.Squeak();
    }
}
