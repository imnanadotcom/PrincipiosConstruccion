public class Triangle extends Figure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super(3); 
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * base;
    }
}
