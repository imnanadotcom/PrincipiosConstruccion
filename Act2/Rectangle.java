public class Rectangle extends Figure implements Figure.Resize {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super(4); 
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void resize(double x) {
        width *= x;
        height *= x;
    }
}