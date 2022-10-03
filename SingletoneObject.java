public class SingletoneObject {

   //create an object of SingleObject
   private static SingletoneObject instance = new SingletoneObject();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingletoneObject(){}

   //Get the only object available
   public static SingletoneObject getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}