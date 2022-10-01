public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape redCircle = new RedShapeDecorator(circle);
        Shape redRectangle = new RedShapeDecorator(rectangle);

        Shape FilledredCircle = new FillShapeDecorator(redCircle);
        System.out.println("Circle with normal border");
        circle.Draw();

        System.out.println("Circle of red border");
        redCircle.Draw();

        System.out.println("Rectangle of red border");
        redRectangle.Draw();
        
        System.out.println("Circle of red border and filled");
        FilledredCircle.Draw();

    }
}
