import java.net.SocketPermission;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationMultiply());
        System.out.println("10*5 = "+context.executeStrategy(10, 5));
    }
}
