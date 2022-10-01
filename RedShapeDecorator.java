public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void Draw(){
        decoratedShape.Draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
