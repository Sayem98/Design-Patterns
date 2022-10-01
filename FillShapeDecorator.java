public class FillShapeDecorator extends ShapeDecorator {
    public FillShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void Draw(){
        decoratedShape.Draw();
        FillShape(decoratedShape);
    }

    private void FillShape(Shape decoratedShape){
        System.err.println("Fill Color: Red");
    }
}
