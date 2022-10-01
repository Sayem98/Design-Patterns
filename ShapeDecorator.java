public class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape){
        this.decoratedShape = shape;
    }

    
    public void Draw(){
        decoratedShape.Draw();
    }
}
