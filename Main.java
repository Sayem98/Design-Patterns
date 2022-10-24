public class Main {
    public static void main(String[] args) {
      SingletoneObject object = SingletoneObject.getInstance();
      
      // SingletoneObject object2 = new SingletoneObject(); can't do this. contructor is private.
      
      

      //show the message
      object.showMessage();
   } 
}
