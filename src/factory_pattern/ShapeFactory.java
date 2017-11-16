package factory_pattern;

public class ShapeFactory {

    /**
     * 使用 getShape 方法获取形状类型的对象
     *
     * @param shapeType Shape类型(CIRCLE,RECTANGLE,SQUARE)
     * @return Shape对象 Square
     */
    public Shape getShape(String shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case "CIRCLE":
                shape = new Circle();
                break;
            case "RECTANGLE":
                shape = new Rectangle();
                break;
            case "SQUARE":
                shape = new Square();
                break;
            default:
                shape = null;
        }
        return shape;
    }
}
